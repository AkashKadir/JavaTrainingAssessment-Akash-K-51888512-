package areaofshape;

public class Circle extends Shape{
	
	private double radius;
	
	Circle(){};

	public Circle(double radius) {
		this.radius = radius;
	}

	public void computeArea() {
		area=3.142857 * (radius * radius);
	}

}