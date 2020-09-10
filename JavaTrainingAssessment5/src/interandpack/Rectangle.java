package interandpack;

public class Rectangle implements Polygon{

	double length;
	double breadth;
	
	Rectangle(){};
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public double calcPeri() {
		double peri = 2*(length+breadth);
		return peri;
	}
	@Override
	public double calArea() {
		double area = length*breadth;
		return area;
	}
}
