package lab9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	
	String ODD_DELIMITER = ""+(char)0;
	String filename;
	String text;
	
	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}
	
	public String getText() {
		return text;
	}

	boolean symbolsBalanced(String delimiters){
		//TODO: implement this method
		Stack<String> stack = new Stack<String>();
		
		String openingCase  = "";
		String closingCase  = "";
		
		for(int i =0; i<delimiters.length();i++)
		{
			if(i%2==0)
				openingCase += ""+delimiters.charAt(i);
			else
				closingCase += ""+delimiters.charAt(i);
		}
		for(int i=0; i<text.length(); i++)
		{
			if(openingCase.contains(""+text.charAt(i)))
				stack.push(""+text.charAt(i));
			else if(closingCase.contains(""+text.charAt(i)))
			{
				//int a = Integer.parseInt(stack.peek());
				//int b = Integer.parseInt(""+text.charAt(i));
				if(stack.isEmpty()) return false;
				//if(a+1!=b || a+2 !=b) return false;
		        stack.pop();
			}
	
		}
		if(stack.isEmpty()) return true;
		return false;

	}
	
	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("Employee.java");
		System.out.println(sb.getText());
		System.out.println(sb.symbolsBalanced("[]{}<>()"));
	}
	
	void readFile() {
		try {
			Scanner sc = new Scanner(new File(filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			System.out.println(text);
			sc.close();
		}
		catch(FileNotFoundException ex) {
			System.err.println("File Not Found Exception "+ex.getMessage());
		}
	}

}



