package lab4_3;

public class Square extends ClosedCurve implements Polygon {

	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	
	@Override
	public double computeArea() {
		return side * side;
	}

	
	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return this.getNumberOfSides()*this.side;
	}

	

}
