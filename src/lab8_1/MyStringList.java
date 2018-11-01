package lab8_1;

import java.util.Collections;
import java.util.Set;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		if(size == strArray.length) resize();
		strArray[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(String s){
		for(String test : strArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if(pos > size) return;
		if(pos >= strArray.length||size+1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
		
	}
	
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}
	
	
	private void resize(){
		int len = strArray.length;
		int newlen = len+1;
		String[] temp = new String[newlen];
		System.arraycopy(strArray,0,temp,0,len);
		strArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}
	
	public void sort(){
		if(strArray == null || strArray.length <=1) return;
		int len = strArray.length;		
		for(int i = 0; i < len; ++i){
			int nextMinPos = minpos(i,len-1);
			swap(i,nextMinPos); 
		}
	}
	
	public int minpos(int bottom, int top){		
		String m = strArray[bottom];
		int index = bottom;
		for(int i = bottom+1; i <= top; ++i){
			if(strArray[i].compareTo(m) < 0){ 
				m = strArray[i];
				index = i;
			}
		}
		//return location of min, not the min itself
		return index;
	}
	
	void swap(int i, int j){
		String temp = strArray[i];
		strArray[i] = strArray[j];
		strArray[j] = temp;		
	}
	

	boolean search(String[] arr, String s)
	{
		if(arr == null || arr.length <=1) return false;
		if(arr.length==1) return arr[0].equals(s) ? true : false;
		int len = arr.length/2;
		String[] temp = new String[len];
		String[] temp1 = new String[arr.length-len];
		//      (src   , src-offset  , dest , offset, count)
		System.arraycopy(arr, 0, temp, 0, len);
		System.arraycopy(arr, len, temp1, 0, arr.length-len);

		if(arr[len].compareTo(s) == 0) {
			return true;
		}
		else if(arr[len].compareTo(s) < 0) {
			return search(temp1, s);
		}
		else if(arr[len].compareTo(s) > 0){
			return search(temp, s);
		}
		else
		 return false;
	}
	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("small");
		l.add("tall");
		l.add("short");
		l.add("round");
		l.add("square");
		l.add("enormous");
		l.add("tiny");
		l.add("gargantuan");
		l.add("lilliputian");
		l.add("numberless");
		l.add("none");
		l.add("vast");
		l.add("miniscule");
		//((Set<String>) l).removeAll(Collections.singleton(null));
		l.sort();
		System.out.println(l);
		System.out.println(l.search(l.strArray, "number"));
		System.out.println(l.search(l.strArray, "tiny"));
				
	}

}
