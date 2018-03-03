package hashcode;

import java.util.ArrayList;

public class Vehicle {
	
	private int n;
	private Coord pos;
	private Ride assigned = null;
	private ArrayList<Integer> history = new ArrayList<Integer>();
	
	public Vehicle(int n) {
		this.n = n;
		pos = new Coord(0,0);
		assigned = null;
	}

	public Vehicle(Coord p, Ride a) {
		pos = p;
		assigned = a;
	}
	
	public Coord getPos() {
		return pos;
	}

	public void setPos(Coord pos) {
		this.pos = pos;
	}

	public Ride getAssigned() {
		return assigned;
	}

	public void setAssigned(Ride assigned) { //adds ride to history
		this.assigned = assigned;
		this.history.add(assigned.getN());
		assigned.setStatus(Status.DRIVING);
	}
	
	@Override
	public String toString() {
		return "Vehicle [n= " + n + ", pos=" + pos + ", assigned=" + assigned + "]";
	}

	public ArrayList<Integer> getHistory() {
		return history;
	}

	public void setHistory(ArrayList<Integer> h) {
		this.history = h;
	}
	
	public String print() {
		if(history.isEmpty())
			return null;
		
		String res;
		res = "" + n;
		for(Integer i : history) {
			res += " " + i;
		}
		return res;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

}
