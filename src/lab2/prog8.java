package lab2;

public class prog8 {
	public static void main(String[] args)
	{
		int[] a = new int[] {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		System.out.println(min(a));
	}
	static int min(int[] a)
	{
		int min=0;
		for(int i=0; i<a.length; i++)
			if(a[i]<min)
				min = a[i];
		
		return min;
	}
}
