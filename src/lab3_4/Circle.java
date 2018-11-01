package lab3_4;

public final class Circle {
	
	private final double _rad;
	
	public Circle(double rad)
	{
		this._rad = rad;
	}
	
	public double computeArea() {
		return Math.PI * _rad * _rad;
	}
	
	public double get_rad() {
		return _rad;
	}

}
