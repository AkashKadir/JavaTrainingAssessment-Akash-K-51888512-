package areaofshape;

public class Rectangle extends Shape{
	
	private double length;
	private double breadth;
	
	Rectangle(){};
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void computeArea() {
		area= (length * breadth);
	}

}
