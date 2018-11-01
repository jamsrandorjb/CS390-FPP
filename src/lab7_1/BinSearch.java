package lab7_1;

public class BinSearch {
	boolean search(String s, char c)
	{
		if(s == null || s.length() < 1) return false;
		if(s.length()==1) return s.charAt(0) == c ? true : false;
		int len = s.length()/2;
		char ch = s.charAt(len);
		if(ch == c) return true;
		else if(c < ch) search(s.substring(0, len), c);
		else search(s.substring(len), c);
		return false;
	}
	public static void main(String[] args) {
		BinSearch b = new BinSearch();
		System.out.println(b.search("abcde", 'e'));
		
	}
}
