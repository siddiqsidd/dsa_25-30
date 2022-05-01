package assignment_dsa;

import java.util.Arrays;

/*
 * 	"1. Create a myStack Class which has the following methods:
     1. Push(x) : inserts the data into the stack 
     2. Pop(): Removes the top element.
     3. Peek() : Displays the top element.

2. Remove duplicates from a sorted array using stack
 */
public class april_28 {

//1.
	final int size = 5;
	int s[] = new int[size];

	int top = -1;

	int push(int data) {
		if (top >= size - 1) {
			System.out.println("Stack overflow!");
			return -1;
		}

		else {
			top++;
			s[top] = data;
			return s[top];
		}
	}

	int pop() {

		if (top == -1) {
			System.out.println("Stack underflow!");
			return -1;
		}

		else {
			int temp = s[top];
			top--;
			return temp;
		}
	}

	int peek() {

		if (top == -1) {
			System.out.println("Stack is empty!");
			return -1;
		}

		else {
			return s[top];
		}
	}

	boolean isEmpty() {

		return top <= -1 ? true : false;
	}

	void display() {

		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}

		else {
			for (int i = 0; i <= top; i++) {
				System.out.println(s[i]);
			}
		}
	}

//2. Remove duplicates from a sorted array using stack

	
	
/*	
	public static void main (String[] args)
    {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;
         
        n = removeDuplicates(arr, n);
        System.out.println(Arrays.toString(arr));
    }

	public static int removeDuplicates(int arr[], int n)
    {
        if (n==0 || n==1)
            return n;
      
        int[] temp = new int[n];
         
        // Start traversing elements
        int j = 0;
        for (int i=0; i<n-1; i++)
            // If current element is not equal
            // to next element then store that
            // current element
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
         
        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr[n-1];  
         
        // Modify original array
        for (int i=0; i<j; i++)
            arr[i] = temp[i];
      
        return j;
    } */

}
