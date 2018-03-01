package hashcode;

public class Coord {
	
	private int x;
	private int y;
	
	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
}
	
	public Coord(Coord pos) {
		this.x = pos.getX();
		this.y = pos.getY();
	}
	
	public int getX() {
		return x;		
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
}
	
	public boolean isAt(int x, int y){
		return (this.x == x) && (this.y == y);
	}
	
	public void setPosition(Coord cell) {
		this.x = cell.x;
		this.y = cell.y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Coord)) {
			return false;
		}
		Coord other = (Coord) obj;
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Coord [x=" + x + ", y=" + y + "]";
	}
	
}
