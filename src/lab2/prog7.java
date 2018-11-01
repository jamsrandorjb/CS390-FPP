package lab2;

public class prog7 {
	public static void main(String[] args) {
		int x1 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(9-1)+1);
		int y1 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(14-3)+3);
		int x2 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(9-1)+1);
		int y2 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(14-3)+3);
		int x3 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(9-1)+1);
		int y3 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(14-3)+3);
		int x4 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(9-1)+1);
		int y4 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(14-3)+3);
		int x5 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(9-1)+1);
		int y5 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(14-3)+3);
		int x6 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(9-1)+1);
		int y6 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(14-3)+3);
		int x7 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(9-1)+1);
		int y7 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(14-3)+3);
		int x8 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(9-1)+1);
		int y8 = RandomNumbers.getRandomInt(1,99);// (int) (Math.random()*(14-3)+3);
		
		
		String output = "";
		output = String.format("%4d %8d %12d %16d %n %n %n %n", x1, x2, x3, x4);
		output += String.format("%1s %2d %5s %2d %9s %2d %13s %2d %n %n %n %n","+", y1, "+", y2, "+", y3, "+", y4);
		output += String.format("%1s %9s %11s %16s %n %n %n %n","____", "____", "____", "____");
		output += String.format("%1s %10s %12s %15s", x1+y1, x2+y2, x3+y3, x4+y4);
		System.out.println(output);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		output = String.format("%4d %8d %12d %16d %n %n %n %n", x5, x6, x7, x8);
		output += String.format("%1s %2d %5s %2d %9s %2d %13s %2d %n %n %n %n","+", y5, "+", y6, "+", y7, "+", y8);
		output += String.format("%1s %9s %11s %16s %n %n %n %n","____", "____", "____", "____");
		output += String.format("%1s %10s %12s %15s", x5+y5, x6+y6, x7+y7, x8+y8);
		System.out.println(output);
	}
}
