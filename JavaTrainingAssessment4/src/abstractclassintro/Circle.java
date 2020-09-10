package abstractclassintro;

public class Circle extends Shape{
	
	private float radius;
	
	Circle(){};
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public Double calculatePerimeter() {
		double per = 2*3.14*radius;
		return per;
	}

}
