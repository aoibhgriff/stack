package stack;

import java.util.Scanner;

public class TestStack {
	public static void printMenu() {
		System.out.println("Welcome to StackTest! Please select a number from the list.");
		System.out.println("");
		System.out.println("1. Push a string on to the stack");
		System.out.println("2. Pop a string from the stack");
		System.out.println("3. Peek at the top of the stack");
		System.out.println("4. Empty the stack");
		System.out.println("5. Check if a string has balanced brackets.");
		System.out.println("6. Quit the program");
	}
	
	public static boolean isBalanced(String s) {
		StackReferenceBased stack = new StackReferenceBased();
		boolean balancedSoFar = true;
		int k = 0;
		
		while (balancedSoFar && k < s.length()) {
			char ch = s.charAt(k);
			k++;
			
			if (ch == '{') {
				stack.push('{');
			}
			
			else if (ch == '}') {
				if (!stack.isEmpty()) {
					Object openBrace = stack.pop();
					
				}
				else 
					balancedSoFar = false;
			}
			
		}
		
		if (balancedSoFar && stack.isEmpty()) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackReferenceBased stack = new StackReferenceBased();
		stack.displayStack();
		Scanner scanner = new Scanner(System.in);
	}

}
