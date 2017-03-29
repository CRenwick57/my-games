import java.awt.Point;

public class Block {
	
	private int x;
	private int y;
	private int lastX;
	private int lastY;
	
	public Block(){
		
	}
	
	public Block(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public int getLastX() {
		return lastX;
	}

	public void setLastX(int lastX) {
		this.lastX = lastX;
	}

	public int getLasyY() {
		return lastY;
	}

	public void setLasyY(int lastY) {
		this.lastY = lastY;
	}
	
	public Point move(Point p){
		lastY = y;
		lastX = x;
		x = p.x;
		y = p.y;
		Point old = new Point(lastX, lastY);
		return old;
	}
	
}
