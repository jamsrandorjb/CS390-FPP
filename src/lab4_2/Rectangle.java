package lab4_2;


public final class Rectangle extends ClosedCurve {
	private final double _width;
	private final double _length;
	public Rectangle(double width, double length) {
		this._width = width;
		this._length = length;
	}
	public double computeArea() {
		return (_length * _width);
	}
}
