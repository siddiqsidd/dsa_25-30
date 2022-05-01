package assignment_dsa;
/*
 * 	"""Implement a queue data structure using the following data structure:  
  1. Arrays
  2. LinkedList """
 */
public class april_30 {
	//1.. Queue implementation in Java 1. using array

	  int SIZE = 5;
	  int items[] = new int[SIZE];
	  int front, rear;

	  april_30() {
	    front = -1;
	    rear = -1;
	  }

	  boolean isFull() {
	    if (front == 0 && rear == SIZE - 1) {
	      return true;
	    }
	    return false;
	  }

	  boolean isEmpty() {
	    if (front == -1)
	      return true;
	    else
	      return false;
	  }

	  void enQueue(int element) {
	    if (isFull()) {
	      System.out.println("Queue is full");
	    } else {
	      if (front == -1)
	        front = 0;
	      rear++;
	      items[rear] = element;
	      System.out.println("Inserted " + element);
	    }
	  }

	  int deQueue() {
	    int element;
	    if (isEmpty()) {
	      System.out.println("Queue is empty");
	      return (-1);
	    	} 
	    	else {
	      element = items[front];
	      if (front >= rear) {
	        front = -1;
	        rear = -1;
	      }
	      else {
	        front++;
	      }
	      System.out.println("Deleted -> " + element);
	      return (element);
	    }
	  }

	  void display() {
	    int i;
	    if (isEmpty()) {
	      System.out.println("Empty Queue");
	    } else {
	      System.out.println("\nFront index-> " + front);
	      System.out.println("Items -> ");
	      for (i = front; i <= rear; i++)
	        System.out.print(items[i] + "  ");

	      System.out.println("\nRear index-> " + rear);
	    }
	  }

	  public static void main(String[] args) {
		  april_30 q = new april_30();

	    q.deQueue();
	    q.enQueue(1);
	    q.enQueue(2);
	    q.enQueue(3);
	    q.enQueue(4);
	    q.enQueue(5);

	    q.enQueue(6);

	    q.display();
	    q.deQueue();
	    q.display();

	  }
	  
		// 2.  Queue implementation in Java 2. using LinkedList

	  /*
	   * public class LinkedQueue{
    private int length;
    private ListNode front, rear;
   public LinkedQueue(){
         length = 0;
         front = rear = null;
    }

    public void enQueue (int data){
         ListNode node = new ListNode(data);
         if (isEmpty())
              front = node;
         else
              rear.setNext (node);
         rear = node;
         length++;
    }

  public int deQueue() throws Exception{
        if (isEmpty())
              throw new Exception ("queue");
        int result = front.getData();
        front = front.getNext();
        length--;
        if (isEmpty())
             rear = null;
        return result;
    }

    public int first() {
        if (isEmpty())
            throw new Exception(); 

        return front.getData();
    }

    public boolean isEmpty(){
         return (length == 0);
    }

    public int size(){
        return length;
    }

    	public String toString(){
        String result = "";
        ListNode current = front;
        while (current != null){
            result = result + current.toString() + "\n";
            current = current.getNext();
        }
        return result;
    }
 
    public static void main(String[] args)  {
        LinkedQueue arrayQueue = new LinkedQueue();
        arrayQueue.enQueue(10);
        arrayQueue.enQueue(20);
        arrayQueue.enQueue(30);
        arrayQueue.enQueue(40);
        arrayQueue.enQueue(50);
        arrayQueue.enQueue(60);
        arrayQueue.enQueue(70);
        arrayQueue.enQueue(80);
        arrayQueue.enQueue(90);
        arrayQueue.deQueue();
        System.out.println(arrayQueue.toString());
    }
}
	   */
	

}
