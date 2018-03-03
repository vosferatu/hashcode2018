package hashcode;

public class Ride implements Comparable<Object> {
	private int n;
	private Coord start;
	private Coord end;
	private int earliest;
	private int latest;
	private Status status;
	
	public Ride(int n, Coord s, Coord e, int early, int late) {
		this.n = n;
		start = s;
		end = e;
		earliest = early;
		latest = late;
		this.status = Status.INCOMPLETED;
	}
	
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public Coord getStart() {
		return start;
	}
	
	public void setStart(Coord start) {
		this.start = start;
	}
	
	public Coord getEnd() {
		return end;
	}
	
	public void setEnd(Coord end) {
		this.end = end;
	}
	
	public int getEarliest() {
		return earliest;
	}
	
	public void setEarliest(int earliest) {
		this.earliest = earliest;
	}
	
	public int getLatest() {
		return latest;
	}
	
	public void setLatest(int latest) {
		this.latest = latest;
	}
	
	@Override
	public String toString() {
		return "Ride [n=" + n + ", start=" + start + ", end=" + end + ", earliest=" + earliest + ", latest=" + latest
				+ "]";
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Ride ride = (Ride)obj;
		if(this.start != ride.start) {
			
		}
		if(this.latest != ride.latest) {
			return Integer.compare(this.latest, ride.latest);
		} else {
			return Integer.compare(this.earliest, ride.earliest);
		}
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
