package lab4_3;

public class Test2 {
	public static void main(String[] args) {
		Polygon[] a = new Polygon[3];
		a[0] = new Rectangle(3,4);
		a[1] = new Triangle(4,5,6);
		a[2] = new Square(3);
		for(int i=0; i<a.length; i++)
		{
			System.out.println("For this "+a[i].getClass().getSimpleName()+" \n Number of sides = "
					+a[i].getNumberOfSides()+"\n Premieter = "+a[i].computePerimeter());
		}
	}
}
