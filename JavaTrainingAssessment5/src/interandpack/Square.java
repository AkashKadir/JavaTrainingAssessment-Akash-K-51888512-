package interandpack;

public class Square implements Polygon{

	double side=0;
	
	Square(){};
	
	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double calcPeri() {
		double peri = 4*side;
		return peri;
	}

	@Override
	public double calArea() {
		double area = side*side;
		return area;
	}	
	
}
