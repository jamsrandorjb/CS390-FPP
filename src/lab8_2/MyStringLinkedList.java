package lab8_2;



public class MyStringLinkedList{
	Node header;
	static int size;
	public MyStringLinkedList(){
		header = new Node(null,null, null);
		size =0;
	}
	
	public void add(String item){
		Node n = new Node(header.next,header,item);
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;
		size++;
	}
	void insert(String data, int pos) {
		Node temp = header.next;
		if(temp == null //if linkedlist is null
		   || temp.next == null //if linked has only one element
		   || pos == 0 //adding to 0th position
		)
		{
			add(data);
			return;
		}
		//if someone trying to add position which is not yet has
		pos = pos>size ? size-1 : pos;
		int i = 0;
		while(temp.value != null || temp.next != null) 
		{
			if(pos == i)
			{
				Node n = new Node(temp,temp.previous,data);
				Node tempP = (Node)temp.previous;
				tempP.next = n;
				n.previous = tempP;
				n.next = temp;
				temp.previous = n;	
				size++;
				return;
			}
			temp = temp.next;
			if(temp == null) break;
			++i;
		}
	}

	public boolean remove(String data) {
		Node temp = header.next;
		//if removing first element
		if (temp.value.equals(data)) 
		{
			Node next = temp.next;
			header.next = next;
			next.previous = header;
			temp = null;
			return true;
		}
		//if linkedlist has only one element
		if(temp.next == null && temp.value.equals(data))
		{
			Node prev = temp.previous;
			prev.next = null;
			temp = null;
			return true;
		}
		while(temp.value != null || temp.next != null) {
			if(temp.value.equals(data))
			{
				Node prev = temp.previous;
				Node next = temp.next;
				prev.next = next;
				if(next != null) next.previous = prev;
				temp = null;
				return true;
			}
			temp = temp.next;
			if(temp== null) return false;
		}
		return false;
	}
	
	void print() {
		if(header.next == null || size <=1 ) {
			System.out.println("LinkedList is empty");
			return;	
		} 
		for(int i=0; i<size; ++i)
		{
			Node n = findCase(i);
			System.out.println(i+" : "+n.value); 
		}
	}
	
	boolean search(String s, int startRange, int EndRange)
	{
		if(header.next == null || (EndRange-startRange) <1 ) return false;
		if((EndRange-startRange)==1) return findCase(0).value.equals(s) ? true : false;
		int len = startRange+(EndRange-startRange)/2;
		
		if(findCase(len).value.compareTo(s) == 0) {
			return true;
		}
		else if(findCase(len).value.compareTo(s) < 0) {
			return search(s, len, size);
		}
		else if(findCase(len).value.compareTo(s) > 0){
			return search(s, startRange, len);
		}
		else
		 return false;
	}

	
	public void sort(){
		if(header.next == null || size <=1 ) return;
		for(int i=0; i<size; ++i)
		{
			Node n = findCase(i);
			Node minNode1 = minNode(n);
			swap(n, minNode1); 
		}
		
	}
	public Node findCase(int i) {
		Node caseNode = new Node(null, null, null);
		Node temp = header.next;
		int j =0;
		while(temp.value != null || temp.next != null  ) 
		{
			if(temp.value != null && i==j)
				return temp;
			temp = temp.next;
			if(temp== null) break;
			++j;
		}
		return caseNode;
	}
	
	public Node minNode(Node n){		
		Node minNode = n;
		//null check for n
		Node currentNode = n.next;
		while(currentNode != null) {
			if(currentNode.value.compareTo(minNode.value)<0)
				minNode = currentNode;
			currentNode = currentNode.next;
		}
		return minNode;
	}
	
	void swap(Node a, Node b){
		if (a == b) return;
	    if (a.next == b) { // right next to each other
	        a.next = b.next;
	        b.previous = a.previous;

	        if (a.next != null)
	            a.next.previous = a;

	        if (b.previous != null)
	            b.previous.next = b;
	        b.next = a;
	        a.previous = b;
	    } else {
	        Node p = b.previous;
	        Node n = b.next;

	        b.previous = a.previous;
	        b.next = a.next;

	        a.previous = p;
	        a.next = n;

	        if (b.next != null)
	            b.next.previous = b;
	        if (b.previous != null)
	            b.previous.next = b;

	        if (a.next != null)
	            a.next.previous = a;
	        if (a.previous != null)
	            a.previous.next = a;

	    }
	}
	
	public class Node {
		String value;
		Node next;
		Node previous;
		public String getValue() {
			return value;
		}
		Node(Node next, Node previous, String value){
			this.next = next;
			this.previous = previous;
			this.value = value;
		}
	}
	
	public static void main(String[] args) {
		MyStringLinkedList l = new MyStringLinkedList();
		l.add("big"); 
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
		l.print();
		l.sort();
		l.print();
//		System.out.println("---------------------------------------------");
//		l.insert("NEWDATAAAAAAAAAA1", 0);
//		l.insert("NEWDATAAAAAAAAAA2", 1);
//		l.insert("NEWDATAAAAAAAAAA5", size+10);
//		l.print();
//		System.out.println("---------------------------------------------");
//		l.remove("big");
//		l.remove("NEWDATAAAAAAAAAA2");
//		l.remove("NEWDATAAAAAAAAAA1");
//		l.remove("nonexist");
		
//		l.print();
		System.out.println(l.search("number", 0, size));
		System.out.println(l.search("miniscule", 0, size));
		
		
	}
	
}

