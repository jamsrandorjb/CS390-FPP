package lab3_4;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		
		if(size==0 || size ==1) {
			strArray[size] = s;
			size ++;
			return;	
		}
		String[] tempArray = new String[strArray.length+1];
		for(int i=0; i<strArray.length; i++)
			tempArray[i]=strArray[i];
		tempArray[strArray.length-1] = s;
		strArray = tempArray;
		size ++;
		
	}
	
	private String[] add(String s, String[] str){
		String[] tempArray = new String[str.length];
		for(int i=0; i<str.length; i++)
			tempArray[i]=str[i];
		tempArray[str.length-1] = s;
		str = tempArray;
		return str;
	}

	public String get(int i){
		return strArray[i];
	}
	
	public boolean find(String s){
		
		for(String a : strArray)
			if(a.equals(s))
				return true;
		
		return false;
		
	}
	
	public void insert(String s, int pos){
		//implement
		String[] tempArray = new String[strArray.length+1];
		for(int i=0; i<pos; i++)
			tempArray[i] = strArray[i];
		tempArray[pos] = s;
		for(int i = pos + 1; i <= strArray.length; i++)
	        tempArray[i] = strArray[i - 1];	
		strArray = tempArray;
		size++;
	}
	
	public boolean remove(String s){
		int n=-1;
		for(int i =0; i <strArray.length; i++)
			if(strArray[i] != null && strArray[i].equals(s))
				n = i;
		if(n>-1) {
			String[] tempArray = new String[strArray.length-1];
			
			for(int i=0; i<n; i++)
				tempArray[i] = strArray[i];
			for(int i = n + 1; i < strArray.length; i++)
		        tempArray[i-1] = strArray[i];	
			
			strArray = tempArray;
			size--;
			return true;
		}
			
		return false;
	}
	
	
	private void resize(){
		String[] arraynew = new String[strArray.length*2];
		System.arraycopy(strArray, 0, arraynew, 0, strArray.length);
		strArray = arraynew;
	}
	
	public String toString(){
		//implement
		return Arrays.toString(strArray);
	}
	public int size() {
		//size = strArray.length;
		return size;
	}

	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size "+l.size()+" is after adding Bob "+l);
		l.add("Steve");
		System.out.println("The list of size "+l.size()+" is after adding Steve "+l);
		l.add("Susan");
		System.out.println("The list of size "+l.size()+" is after adding Susan "+l);
		l.add("Mark");
		System.out.println("The list of size "+l.size()+" is after adding Mark "+l);
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is after adding Dave "+l);
		l.remove("Mark");
		System.out.println("The list of size "+l.size()+" is removing adding Mark "+l);
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is removing adding Bob "+l);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);		
	}

}
