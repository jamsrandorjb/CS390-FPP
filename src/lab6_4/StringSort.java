package lab6_4;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
	
	@SuppressWarnings("rawtypes")
	Comparator mC;
	public StringSort() {}
	public StringSort(Comparator<String> myComparator)
	{
		this.mC = myComparator;
	}
	
	@SuppressWarnings("unchecked")
	public String[] stringSort(String[] arr) {
		Arrays.sort(arr, mC);
		return arr;
	}
	static class LengthCompare implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o1.length() - o2.length();
		}
	}

}
