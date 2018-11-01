package lab4_3;

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
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return (this._width+this._length)*2;
	}


}
