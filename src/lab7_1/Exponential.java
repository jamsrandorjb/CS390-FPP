package lab7_1;

public class Exponential {
	double power(double x, int n) {
		if(x == 0 || x ==1 || n == 1) return x;
		if(n == 0) return 1;
		return x*power(x, n-1);
	}
	public Exponential() {}
	public static void main(String[] args) {
		Exponential e = new Exponential();
		System.out.println(e.power(2, 10));
	}
}
