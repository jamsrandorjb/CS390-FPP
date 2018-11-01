package lab3_4;

public final class Rectangle {
	
	private final double _width;
	private final double _length;
	
	public Rectangle(double width, double length)
	{
		this._width = width;
		this._length = length;
	}
	
	public double computeArea() {
		return _width * _length;
	}

	public double get_width() {
		return _width;
	}

	public double get_length() {
		return _length;
	}
	
	
}
