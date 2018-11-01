package lab4_2;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Circle(3), 
								 new Rectangle(3.00, 7.00)};
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.println("The Area of "+cc.getClass()+" is "+cc.computeArea());
			
		}
    
	}

}