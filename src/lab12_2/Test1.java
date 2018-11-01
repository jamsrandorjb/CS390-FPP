package lab12_2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Test1 {
	

	

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String[] unsorted = new String[n];
	        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	            unsorted[unsorted_i] = in.next();
	        }
	        // your code goes here
	    }
	    public static void sort(String[] unsorted){
	        if(unsorted== null || unsorted.length < 1) return;
	        BigInteger min = new BigInteger(unsorted[0]);
	        BigInteger temp = new BigInteger(unsorted[0]);
	        
	        for(int i = 0; i< unsorted.length; i++) {
	            min = new BigInteger(unsorted[i]);
	            for(int j = i+1; j< unsorted.length; j++) 
	            {
	                temp = new BigInteger(unsorted[j]);
	                if(min.compareTo(temp)>0)
	                {
	                    unsorted[i] = ""+temp;
	                    unsorted[j] = ""+min;
	                    min = temp;
	                }
	            }
	        }	    
	   }

}
