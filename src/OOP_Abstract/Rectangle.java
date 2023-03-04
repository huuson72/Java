package OOP_Abstract;

public class Rectangle extends Shape{
    
	public Rectangle(String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
  

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
  @Override
  public String toString() {
  // TODO Auto-generated method stub
  return String.format("Shape[Rectangle[c=%s,f=%s]]", getColor(), filled ? "true" : "false");
  }

}
