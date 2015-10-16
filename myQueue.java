
public class myQueue {
	
	private char[] queueArray;
	private int queueSize;
	private int front;
	private int rear;
	private int numberOfItems;
	
	myQueue(int size){
		queueSize = size;
		queueArray = new char[size];
		front = 0;
		rear = 0;
	}
	
	public void enqueue(char input){
		if(numberOfItems + 1  <= queueSize){
			queueArray[rear] = input;
			rear++;
			numberOfItems++;
		} else {
			System.out.println("Queue is full.");
		}
	}
	
	public char dequeue(){
		char toReturn;
		if(numberOfItems  > 0){
			toReturn = queueArray[front];
			front++;
			numberOfItems--;
		} else {
			System.out.println("Queue is empty.");
			toReturn = 0;
		}
		return toReturn;
	}
	
	public boolean isEmpty(){
		return (numberOfItems == 0);
	}
	
	public boolean isFull(){
		return (numberOfItems == queueSize);
	}
}
