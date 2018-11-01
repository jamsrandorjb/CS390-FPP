package lab3_4;

public final class Triangle {
	
	private final double _height;
	private final double _base;
	
	public Triangle(double height, double base) {
		this._base = base;
		this._height = height;
	}
	
	public double computeArea() {
		return (_base*_height)/2;
	}

	public double get_height() {
		return _height;
	}

	public double get_base() {
		return _base;
	}

}
