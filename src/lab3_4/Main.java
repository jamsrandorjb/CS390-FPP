package lab3_4;

public class Main {
	public static void main (String[] args) {
		
		Circle c = new Circle(15.25);
		Rectangle r = new Rectangle(5.00, 6.00);
		Triangle t = new Triangle(7.00, 8.00);
		
		System.out.println("Area of Triangle is "+t.computeArea());
		System.out.println("Area of Circle is "+c.computeArea());
		System.out.println("Area of Rectangle is "+r.computeArea());
	}	
}
