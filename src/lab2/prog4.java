package lab2;

public class prog4 {
	
	
	public static void main(String[] args)
	{
		String[] my = Data.records.split(":");
		String[] my1;
		for(String s : my)
		{
			my1 = s.split(",");
			for(String s1 : my1)
				if(s1.length()==4 && !String.valueOf(s1.charAt(1)).equals(".") && Character.isDigit(s1.charAt(0)))
					System.out.println(s1);
		}
			
	}
}
