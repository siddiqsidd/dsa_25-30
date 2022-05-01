package assignment_dsa;
/*
 * 	"""1. Intersection of two linked lists
2. Find if the liked list is a Palindrome

 */

public class april_26 {

	//1. Intersection of two linked lists
	   static listnode headA,
	   headB;
	   static class listnode {
	      int data;
	      listnode next;
	      listnode(int d) {
	         data = d;
	         next = null;
	      }
	   }
	   int count(listnode head) {
	      int c = 0;
	      while (head != null) {
	         c++;
	         head = head.next;
	      }
	      return c;
	   }
	   int commonPoint(listnode headA, listnode headB) {
	      listnode p1 = headA;
	      listnode p2 = headB;
	      int c1 = count(headA);
	      int c2 = count(headB);
	      if (c1 > c2) {
	         for (int i = 0; i < c1 - c2; i++) {
	            if (p1 == null) {
	               return - 1;
	            }
	            p1 = p1.next;
	         }
	      }
	      if (c1 < c2) {
	         for (int i = 0; i < c2 - c1; i++) {
	            if (p2 == null) {
	               return - 1;
	            }
	            p2 = p2.next;
	         }
	      }
	      while (p1 != null && p2 != null) {
	         if (p1.data == p2.data) {
	            return p1.data;
	         }
	         p1 = p1.next;
	         p2 = p2.next;
	      }
	      return - 1;
	   }
	   public static void main(String[] args) {
		   april_26 list = new april_26();
	      list.headA = new listnode(5);
	      list.headA.next = new listnode(4);
	      list.headA.next.next = new listnode(9);
	      list.headA.next.next.next = new listnode(7);
	      list.headA.next.next.next.next = new listnode(1);
	      list.headB = new listnode(6);
	      list.headB.next = new listnode(7);
	      list.headB.next.next = new listnode(1);
	      System.out.println(list.commonPoint(headA, headB));
	   }
	   
	   //2.Find if the liked list is a Palindrome
	   
	   /*
	    *  public static void main(String args[])  { 
    Node one = new Node("m"); 
    Node two = new Node("a"); 
    Node three = new Node("d"); 
    Node four = new Node("a"); 
    Node five = new Node("s"); 
    one.ptr = two; 
    two.ptr = three; 
    three.ptr = four; 
    four.ptr = five; 
  
    boolean condition = isPalindrome(one); 
    if(condition == true){
      System.out.println("Linked list is a palidrome."); 

    }
    else{
      System.out.println("Linked list is NOT a palidrome."); 

    }
  } 
  static boolean isPalindrome(Node head) 
  { 
    // This pointer will allow the first traversal
    // of the linked list
    Node next = head; 
    
    boolean ispalin = true; 
    Stack<String> stack = new Stack<String>(); 
    
    // Traverse the linked list and add its elements
    // to the stack
    while (next != null) { 
      stack.push(next.data); 
      next = next.ptr; 
    } 
    // Iterate the linked list again and  
    // check by each element with the stack 
    while (head != null) { 
      String i = stack.pop(); 
      if (head.data == i) { 
        ispalin = true; 
      } 
      else { 
        ispalin = false; 
        break; 
      } 
      // Move to the next element in stack and the list 
      head = head.ptr; 
    } 
    return ispalin; 
  } 
} 
  
class Node { 
  String data; 
  Node ptr; 
  Node(String d) 
  { 
    ptr = null; 
    data = d; 
  } 
}  */
	
}
