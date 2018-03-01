package hashcode;

public class Ride {
	private int n;
	private Coord start;
	private Coord end;
	private int earliest;
	private int latest;
	
	public Ride(int n, Coord s, Coord e, int early, int late) {
		this.n = n;
		start = s;
		end = e;
		earliest = early;
		latest = late;
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
	
}
