package lab6_4;

import java.util.Arrays;

public class Main {
	private static StringSort c = new StringSort();
	public static void main(String[] args) {
		String[] ss = new String[10];
		String[] ss1 = new String[10];
		ss[0] = "creating";
		ss[1] = "strings";
		ss[2] = "array";
		ss[3] = "that";
		ss[4] = "contains";
		ss[5] = "any";
		ss[6] = "strings";
		ss[7] = "i";
		ss[8] = "want";
		ss[9] = "example";
		
		
		StringSort sc = new StringSort(new StringSort.LengthCompare());
		//Comparator<String> comp = new Comparator(StringSort);
	    /* pass in comparator to constructor*/
		ss1 = sc.stringSort(ss);
		System.out.println(Arrays.toString(ss1));
	}
}
