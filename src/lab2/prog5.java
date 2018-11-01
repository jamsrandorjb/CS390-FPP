package lab2;
import java.util.Scanner;

public class prog5 {
	
    public static void main(String[] args) {
    	
    		Scanner sc = new Scanner(System.in);
    		System.out.print("Enter your text here:");
    		String word = sc.nextLine();
    		
    		for(int i = 0; i < word.length(); i++)
    			System.out.print(word.charAt(word.length()-1-i));
    		
    		//System.out.println(new StringBuilder(word).reverse().toString());
    		sc.close();
    		
    }
    
}
