package areaofshape;

public class Triangle extends Shape {

	private double base;
	private double height;
	
	Triangle(){};
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public void computeArea() {
		area =0.5 * (base * height);
	}
	
}
