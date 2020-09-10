package abstractclassintro;

public class Rectangle extends Shape{

	private float length;
	private float breadth;
	
	Rectangle(){};
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public Double calculatePerimeter() {

		double per = 2*(length+breadth);
		return per;
	}

}
