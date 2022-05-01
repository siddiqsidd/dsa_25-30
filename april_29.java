package assignment_dsa;
import java.util.Stack; 

/*
 * 	"""1. Evaluate a postfix expression

2. Basic Calculator
 */

import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class april_29 {
	
	  //1. Evaluate a postfix expression
	
	    static int evaluatePostfix(String exp){ 
	        
	        Stack<Integer> stack=new Stack<>(); 
	          
	        for(int i=0;i<exp.length();i++){ 
	            char c=exp.charAt(i); 
	              
	            if(Character.isDigit(c)){ 
	                stack.push(c - '0'); 
	            }    
	              
	            else{ 
	                int val1 = stack.pop(); 
	                int val2 = stack.pop(); 
	                  
	                switch(c){ 
	                    case '+': 
	                        stack.push(val2+val1); 
	                        break; 
	                      
	                    case '-': 
	                        stack.push(val2- val1); 
	                        break; 
	                      
	                    case '/': 
	                        stack.push(val2/val1); 
	                        break; 
	                      
	                    case '*': 
	                        stack.push(val2*val1); 
	                        break; 
	                } 
	            } 
	        } 
	        return stack.pop();     
	    } 
	      
	    public static void main(String[] args){
	        
	        String s = "231*+9-10+"; 
	        System.out.println(evaluatePostfix(s));
	        calculator();
	    }
	        
	    //2. Basic Calculator
	    
	    
	        public static void calculator(){
    		double num1, num2;
    		Scanner sc = new Scanner(System.in);

    		System.out.println("Enter the numbers");
    		num1 = sc.nextDouble();

    		num2 = sc.nextDouble();

    		System.out.println("Enter the operator (+,-,*,/)");

    		char op = sc.next().charAt(0);

    		double o = 0;

    		switch (op) {
    		case '+':

    			o = num1 + num2;

    			break;
    		case '-':

    			o = num1 - num2;

    			break;
    		case '*':

    			o = num1 * num2;

    			break;
    		case '/':

    			o = num1 / num2;

    			break;

    		default:

    			System.out.println("You enter wrong input");

    			break;
    		}

    		System.out.println("The final result:");

    		System.out.println();

    		System.out.println(num1 + " " + op + " " + num2
    						+ " = " + o);
    	
	        
	    } 
}
