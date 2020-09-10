package abstractclassintro;

public class Square extends Shape{
	
	private float side;
	
	Square(){};
	
	public Square(float side) {
		super();
		this.side = side;
	}
	
	@Override
	public Double calculatePerimeter() {
		
		double per = 4*side;
		return per;
	}

}
