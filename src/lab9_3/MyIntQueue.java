package lab9_3;

public class MyIntQueue {
	
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = -1;
	private static int size = 0;
	
	MyIntQueue(){};
	
	private boolean isEmpty() {
		return size < 1 ? true : false;
	}
	private int size() {
		return size;
	}
	private void enqueue(int a) {	
		if(front == -1) front = 0;
		rear++;
		if(rear >= arr.length)
			resize();
		arr[rear] = a;
		size++;
	}
	private void dequeue() {
		if(isEmpty()) return;
		arr[front] = 0;
		front++;
		size--;
	}
	private int peek() {
		if(isEmpty()) return 0;
		return arr[front];
	}
	private void resize() {
		int[] temp = new int[size*2];
		System.arraycopy(arr, 0, temp, 0, size);
		arr = temp;
	}
	
	public static void main(String[] args) {
		MyIntQueue m = new MyIntQueue();
		for(int i = 1; i<100; i++)
			m.enqueue(i);
		System.out.println("peek : "+m.peek());
		m.dequeue();
		System.out.println("removed");
		System.out.println("size after remove: "+ m.size());
		
		System.out.println("peek : "+ m.peek());
		m.dequeue();
		System.out.println("removed");
		System.out.println("size after remove: "+ m.size());
	}

}
