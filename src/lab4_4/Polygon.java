package lab4_4;

public interface Polygon {
		
	default double computePerimeter() {
		return sum(getArrayOfSides());
	}
	public double[] getArrayOfSides();
	
	static double sum(double[] arr) {
		double sum = 0.0;
		for(int i=0; i<arr.length; ++i)
		{
			sum += arr[i];
		}
		return sum;
	}
}
