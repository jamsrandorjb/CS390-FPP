package lab6;

public class MyTable {
	Entry[] entries = new Entry[26];
	
	public void add(char c, String s)
	{
		//inserts the entry (c, s) into the table
		MyTable.Entry e = new MyTable.Entry(c, s);
		//by computing proper array index for c
		entries[(int)c-(int)'a'] = e;
		/*for(int i =0; i<entries.length; i++)
			if(entries[i] == null)
			{
				entries[i]=e;
				break;
			}
		*/
		
	}
	public String get(char c){
		//returns the string in Entry table whose index
		//corresponds to the char c
		String ret = "";
		for(int i =0; i<entries.length; i++)
			if(entries[i] != null && entries[i].getC() == c)
			{
				ret = entries[i].getS();
				break;
			}
		return ret;
	}
	
	public String toString() {
		String ret = "";
		for(int i =0; i< entries.length; i++)
			if(entries[i]!=null)
				ret += entries[i].getC()+" -> " +entries[i].getS()+"\n";
		return ret;
	}
	

	public static void main(String[] args){
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		t.add('j',"Jama");
		t.add('z',"Zam");
		System.out.println("get function result: "+t.get('b'));
		System.out.println(t);
		
	}
	class Entry {
		
		char c;
		String s;
		
		public Entry(char _c, String _s) {
			this.c = _c;
			this.s = _s;
		}
		
		public char getC() {
			return c;
		}

		public String getS() {
			return s;
		}
	}
	

}
