package lab12_1;

public class Test {
	
	public static void main(String[] args) throws IllegalClosedCurveException {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3,7),
								 new Circle(3)};
		//compute areas
		for(ClosedCurve cc : objects) {
			String nameOfCurve = cc.getClass().getSimpleName();

			System.out.println("The area of this "+
								nameOfCurve+ 
								" is "+
								cc.computeArea());
							
			}	
	}

}
