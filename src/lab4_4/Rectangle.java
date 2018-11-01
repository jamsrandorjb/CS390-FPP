package lab4_4;

public class Rectangle extends ClosedCurve implements Polygon {
	
	private final double _width;
	private final double _length;
	
	public Rectangle(double width, double length) {
		this._width = width;
		this._length = length;
	}
	@Override
	public double computeArea() {
		return (_length * _width);
	}
	@Override
	public double[] getArrayOfSides() {
		// TODO Auto-generated method stub
		double[]  a = {this._length, this._width, this._length, this._width};
		return a;
	}
	


}
