package dataStructure;

import java.util.Arrays;

import Graph.Vertex;

//stack point: top element indicator, size, buffer(array), push, pop and peek.
public class stack {
	
	private Vertex[] stackArray;
	private int stackSize;
	
	// Sets stack as empty
	
	private int topOfStack = -1;
	
	public stack(int size){
		
		stackSize = size;
		
		stackArray = new Vertex[size];
		
		// Assigns the value of -1 to every value in the array
		// so I control what gets printed to screen
		
		Arrays.fill(stackArray, null);
		
	}
	public boolean isEmpty(){
		for (Vertex v: stackArray){
			if (v != null)
				return false;
		}
		return true;
	}
	public void push(Vertex input){
		
		if(topOfStack+1 < stackSize){
			
			topOfStack++;
			
			stackArray[topOfStack] = input;
			
		} else System.out.println("Sorry But the Stack is Full");
		
//		displayTheStack();
		
		System.out.println("PUSH " + input.name + " Was Added to the Stack\n");
		
	}
	
	public Vertex pop(){
		
		if(topOfStack >= 0){
			
//			displayTheStack();
			
			System.out.println("POP " + stackArray[topOfStack].getName() + " Was Removed From the Stack\n");
			
			// Just like in memory an item isn't deleted, but instead is just not available
			Vertex popp = stackArray[topOfStack];
			stackArray[topOfStack] = null; // Assigns -1 so the value won't appear
			topOfStack--;
			return popp;
	
			
		} else {
			
			displayTheStack();
			
			System.out.println("Sorry But the Stack is Empty");
			
			return null;
		}
		
		
	}
	
	public Vertex peek(){
		
		displayTheStack();
		
		System.out.println("PEEK " + stackArray[topOfStack] + " Is at the Top of the Stack\n");
		
		return stackArray[topOfStack];
		
	}
//	
//	public void pushMany(String multipleValues){
//		
//		String[] tempString = multipleValues.split(" ");
//		
//		for(int i = 0; i < tempString.length; i++){
//			
//			push(tempString[i]);
//			
//		}
//		
//	}
	
	public void popAll(){
		
		for(int i = topOfStack; i >= 0; i--){
			
			pop();
			
		}
		
	}
	
	public void popDisplayAll(){
		
		String theReverse = "";
		
		for(int i = topOfStack; i >= 0; i--){
			
			theReverse += stackArray[i];
			
		}
		
		System.out.println("The Reverse: " + theReverse);
		
		popAll();
		
	}
	
	public void displayTheStack(){
		
			for(int n = 0; n < 61; n++)System.out.print("-");
			
			System.out.println();
			
			for(int n = 0; n < stackSize; n++){
				
				System.out.format("| %2s "+ " ", n);
				
			}
			
			System.out.println("|");
			
			for(int n = 0; n < 61; n++)System.out.print("-");
			
			System.out.println();
			
			for(int n = 0; n < stackSize; n++){
				
				
				
				if(stackArray[n].equals("-1")) System.out.print("|     ");
				
				else System.out.print(String.format("| %2s "+ " ", stackArray[n]));
				
			}
			
			System.out.println("|");
			
			for(int n = 0; n < 61; n++)System.out.print("-");
			
			System.out.println();
		
	}
	
//	public static void main(String[] args){
//		
//		stack theStack = new stack(10);
//		
////		theStack.push("10");
////		theStack.push("17");
////		theStack.push("13");
//		
//		// Look at the top value on the stack
//		
//		theStack.peek();
//		
//		// Remove values from the stack (LIFO)
//		
//		theStack.pop();
//		theStack.pop();
//		theStack.pop();
//		
//		// Add many to the stack
//		
////		theStack.pushMany("R E D R U M");
//		
//		// Remove all from the stack
//		
//		// theStack.popAll();
//		
//		// Remove all from the stack and print them
//		
//		theStack.popDisplayAll();
//		
//		theStack.displayTheStack();
//		
//		
//	}
	
}