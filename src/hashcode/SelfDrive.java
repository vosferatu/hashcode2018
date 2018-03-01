package hashcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SelfDrive {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File file = new File("res/a_example.in");
		
		ArrayList<Ride> rides = new ArrayList();
		int rows, columns, nvehicles, nrides, bonus, steps;
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
		
		for(Ride ride : rides) {
			System.out.println(ride);
		}
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		for(int i = 0; i < nvehicles; i++) {
			vehicles.add(new Vehicle());
		}
		
		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		
	}

}
