package lab2;

import java.util.Arrays;

public class prog6 {

	public static void main (String[] args)
	{
		String[] arr = {"horse", "dog", "cat", "horse","dog"};
		String[] newarr = removeDups(arr);
		System.out.println(Arrays.toString(newarr));
	}
	
	public static String[] removeDups(String[] list)
	{
		String[] returnArr = new String[list.length];
		int k=0;
		int temp =0;
		for(int i=0; i<list.length; i++)
		{
			temp=0;
			for(int j=0; j<=k; j++)
				if(returnArr[j]!= null && returnArr[j].equals(list[i]))
					temp++;
			if(temp==0)
			{
				returnArr[k]=list[i];
				k++;
			}
		}
		return returnArr;
	}
	
}
