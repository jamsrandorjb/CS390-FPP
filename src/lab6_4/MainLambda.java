package lab6_4;

import java.util.Arrays;

public class MainLambda {
	public static void main(String[] args){
		String[] ss = new String[10];
		String[] ss1 = new String[10];
		ss[0] = "creating1";
		ss[1] = "strings1";
		ss[2] = "array1";
		ss[3] = "that1";
		ss[4] = "contains1";
		ss[5] = "any1";
		ss[6] = "strings1";
		ss[7] = "i1";
		ss[8] = "want1";
		ss[9] = "example1";

		System.out.println(Arrays.toString(new StringSort(new StringSort.LengthCompare()).stringSort(ss)));
		/*stringSort(
			    ss,
			    (StringSort p) -> p.stringSort(ss)  
			);
		StringSort a =new StringSort(new StringSort.LengthCompare());*/
		//ss1 = a -> LengthCompare(ss);
		//  ss1 = () -> a.stringSort(ss);
		//StringSort b = StringSort -> new StringSort(new StringSort.LengthCompare());

		System.out.println(Arrays.toString(ss1));
	}

}
