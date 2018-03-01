package hashcode;

public class Vehicle {
	
	private Coord pos;
	private Ride assigned = null;
	
	public Vehicle() {
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

	public void setAssigned(Ride assigned) {
		this.assigned = assigned;
	}
	
	@Override
	public String toString() {
		return "Vehicle [pos=" + pos + ", assigned=" + assigned + "]";
	}

}
