package lab4_4;

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
	public double[] getArrayOfSides() {
		// TODO Auto-generated method stub
		double[]  a = {this.side, this.side, this.side, this.side};
		return a;
	}

	
	

}
