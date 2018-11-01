package lab11_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Schur {
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(10);
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(10);
		myList.add(1);
		myList.add(1);
		
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < myList.size(); i++) 
			m.put(myList.get(i), myList.get(i));
		myList = new ArrayList<Integer>(m.values());
		
		System.out.println(checkForSum(myList, 19));
	}
	static boolean checkForSum(List<Integer> s, Integer z) {
		if(s == null || s.size() <= 1) return false;
		for(int i=1; i<s.size(); i++) 
			if( s.get(0) + s.get(i) == z) return true;
		checkForSum(s.subList(1, s.size()), z);
		return false;
	}
}
