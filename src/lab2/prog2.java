package lab2;

public class prog2 {
	public static void main (String[] args)
	{
		int x = RandomNumbers.getRandomInt(1,9);// (int) (Math.random()*(9-1)+1);
		int y = RandomNumbers.getRandomInt(3,14);// (int) (Math.random()*(14-3)+3);
		System.out.println(Math.pow(Math.PI, x));
		System.out.println(Math.pow(y,Math.PI));
	}
}
