package assignment_dsa;
/*
 * 	"1. Find the kth element in a linked list from the end of singlly linked list in :
   1. Using two traversal 
   2. In single traversal (using 2 pointer approch).
2. Reverse the last 3 nodes in a linked list
 */
import java.util.*;

public class april_25 {
	
	//1.2 using two pointer approach
	    private Node head;
	 
	    private static class Node {
	        private int value;
	        private Node next;
	 
	        Node(int value) {
	            this.value = value;
	 
	        }
	    }
	 
	    public void addToTheLast(Node node) {
	 
	        if (head == null) {
	            head = node;
	        } else {
	            Node temp = head;
	            while (temp.next != null)
	                temp = temp.next;
	 
	            temp.next = node;
	        }
	    }
	 
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.format("%d ", temp.value);
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	 
	    public Node nthFromLastNode(Node head,int n)
	    {
	        Node firstPtr=head;
	        Node secondPtr=head;
	 
	        for (int i = 0; i < n; i++) {
	            firstPtr=firstPtr.next;
	 
	        }
	 
	        while(firstPtr!=null)
	        {
	            firstPtr=firstPtr.next;
	            secondPtr=secondPtr.next;
	        }
	 
	        return secondPtr;
	    }
	 
	    public static void main(String[] args) {
	    	april_25 list = new april_25();
	        // Creating a linked list
	        Node head=new Node(5);
	        list.addToTheLast(head);
	        list.addToTheLast(new Node(6));
	        list.addToTheLast(new Node(7));
	        list.addToTheLast(new Node(1));
	        list.addToTheLast(new Node(2));
	 
	        list.printList();
	        // Finding 3rd node from end
	        Node nthNodeFromLast= list.nthFromLastNode(head,3);
	        System.out.println("3th node from end is : "+ nthNodeFromLast.value);
	 
	    }
	    
	    
	    //1.1 Using two traversal
	    
	    
	    /*
		public static Node findKthNode(Node head, int k)
		{
			int n = 0;
			Node curr = head;

			// count the total number of nodes in the linked list
			while (curr != null)
			{
				curr = curr.next;
				n++;
			}

			// if the total number of nodes is more than or equal to `k`
			if (n >= k)
			{
				// return (n-k+1)'th node from the beginning
				curr = head;
				for (int i = 0; i < n - k; i++) {
					curr = curr.next;
				}
			}

			return curr;
		}

		public static void main(String[] args)
		{
			// input keys
			int[] keys = { 1, 2, 3, 4, 5 };

			Node head = null;
			for (int i = keys.length - 1; i >= 0; i--) {
				head = new Node(keys[i], head);
			}

			int k = 3;
			Node node = findKthNode(head, k);

			if (node != null) {
				System.out.println("k'th node from the end is " + node.data);
			}
		} */
	    
	    
	    
	    //2.Reverse the last 3 nodes in a linked list
	    

	    /*
	     * 	public static void main(String[] args) {
		for(int i = 1;i<=9;i++)
		{
			addFirst(i*10);
		}
		
		display();
		int k=3;
		reverse();
		lastreverse(k);
		reverse();
		display();
		
	
	}
	private static void lastreverse(int k) {

		if(head == null) {
			System.out.println("List is empty!");
			return;
		}
		else if(head.next==null) {
			System.out.println("only one element in the list");
			return;
		}
		else {
			//3 variables
			Node prev = null;
			Node cur = head;
			Node next = head;
			int i=1;
			while(cur!=null && i<=k ) {
				next = cur.next;
				cur.next = prev;
				prev = cur;
				cur = next;
				i++;
			}
			head.next=cur;
			head = prev;
		}

	
	}
	private static void reverse() {
		if(head == null) {
			System.out.println("List is empty!");
			return;
		}
		else if(head.next==null) {
			System.out.println("only one element in the list");
			return;
		}
		else {
			//3 variables
			Node prev = null;
			Node cur = head;
			Node next = head;
			int i=1;
			while(cur!=null ) {
				next = cur.next;
				cur.next = prev;
				prev = cur;
				cur = next;
				i++;
			}
			head.next=cur;
			head = prev;
		}

	}
	public static void addFirst(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			// This indicates that the list was empty. So make the newnode as head
			head = newNode;
		}
		// List is not empty
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	public static void display() {
		if (head == null) {
			System.out.println("List is empty!");
			return;
		}
		else {
			Node cur = head;
			while (cur != null) {
				System.out.print(cur.data + " ");
				cur = cur.next;
			}
			System.out.println();
		}
	}
	     */
	 
	}


