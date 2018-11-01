package lab9_1;

import lab8_2.MyStringLinkedList;
import lab8_2.MyStringLinkedList.Node;

public class MyStringStack{
	MyStringLinkedList l = new MyStringLinkedList();
	
	MyStringStack(){
	}
	private void push(String s) {
		l.add(s);
	}
	private String pop() {
		Node temp = (Node)l.findCase(0);
		l.remove(temp.getValue());
		return temp.getValue();
	}
	private String peek() {
		Node temp = (Node)l.findCase(0);
		return temp.getValue();
	}
	
	public static void main(String[] args) {
		MyStringStack m = new MyStringStack();
		m.push("Bob");
		m.push("Harry");
		m.push("Alice");
		System.out.println("Popping…"+m.pop());
		System.out.println("Peeking…."+m.peek());
		System.out.println("Popping…"+m.pop());
	}
	
}

