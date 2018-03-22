import java.lang.Math.*;

public class Point {
	private double x, y, z;

	public Point (double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		}

	public Point (double x, double y) {
		this.x = x;
		this.y = y;
		this.z = 0;
		}

	public Point (double x) {
		this.x = x;
		this.y = 0;
		this.z = 0;
		}

	public Point () {
		this.x = 0;
		this.y = 0;
		this.z = 0;
		}

	public double getX() {
		return x;
		}

	public double getY() {
		return y;
		}

	public double getZ() {
		return z;
		}

	public void setX(double x) {
		this.x = x;
		}

	public void setY(double y) {
		this.y = y;
		}

	public void setZ(double z) {
		this.z = z;
		}

	public String toString() {
		return this.x + ", " + this.y + ", " + this.z;
		}

	public static double distance(Point p1, Point p2){
		return Math.hypot(p1.getX()- p2.getX(), p1.getY()-p2.getY());
		}

	public String add(Point p1){
	this.x += p1.getX();
	this.y += p1.getY();
	return this.x + "," + this.y;
		}

	public static void main(String[] arg) {
		System.out.println(new Point(3,2,2).toString());
	    System.out.println(Point.distance(new Point(1,1),new Point(4, 5)));
		System.out.println( new Point( 1, 2 ).add( new Point (4, 5 ) ));
		}
}
