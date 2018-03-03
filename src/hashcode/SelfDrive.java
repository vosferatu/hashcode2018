package hashcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;

public class SelfDrive {
	
	private int rows, columns, nvehicles, nrides, bonus, steps;
	private ArrayList<Ride> rides = new ArrayList();
	private ArrayList<Vehicle> vehicles = new ArrayList();

	public void start() throws FileNotFoundException, IOException {
		
		File file = new File("res/a_example.in");
		int inc_rides = 0;
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String settings = br.readLine();
			String[] num = settings.split(" ");
			rows = Integer.parseInt(num[0]);
			columns = Integer.parseInt(num[1]);
			nvehicles = Integer.parseInt(num[2]);
			nrides = Integer.parseInt(num[3]);
			bonus = Integer.parseInt(num[4]);
			steps = Integer.parseInt(num[5]);
						
		    for(String line; (line = br.readLine()) != null; ) {
		    	String[] numbers = line.split(" ");

				int a = Integer.parseInt(numbers[0]);
				int b = Integer.parseInt(numbers[1]);
				int x = Integer.parseInt(numbers[2]);
				int y = Integer.parseInt(numbers[3]);
				int s = Integer.parseInt(numbers[4]);
				int f = Integer.parseInt(numbers[5]);
				
				rides.add(new Ride(inc_rides, new Coord(a,b), new Coord(x,y), s,f));
		    	inc_rides++;
		    }		    
		    // line is not visible here.
		}
		
		Collections.sort(rides);
	
		for(Ride ride : rides) {
			System.out.println(ride);
		}
	
		for(int i = 0; i < nvehicles; i++) {
			vehicles.add(new Vehicle(i+1));
		}
	
		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		
		this.solve();
		
		this.print();
	}

	private void solve() {
		for(int i = 0; i < steps; i++) {
			for(int j = 0; j < nrides; j++) {
				if(find_vehicle(rides.get(j)) == -1)
					break;
			}
			
			for(Vehicle n : vehicles) {
				
			}
		}
	}
	
	private int find_vehicle(Ride r) {
		if(r.getStatus() != Status.INCOMPLETED)
			return 0;
		if(no_vehicles())
			return -1;
		
		for(Vehicle v : vehicles) {
			if(v.getPos() == r.getStart()) {
				v.setAssigned(r);
			}
		}
		return 0;
	}
	
	private boolean no_vehicles() {
		for(Vehicle v : vehicles) {
			if(v.getAssigned() != null)
				return false;
		}
		return true;
	}

	private void print() throws IOException {
		FileWriter fw = new FileWriter("output.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Vehicle v : vehicles) {
			bw.write(v.print()+"\n");
		}
		
		bw.close();
		fw.close();
	}
}
