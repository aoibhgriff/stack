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
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		
		while(choice != 6) {
			printMenu();
			System.out.print("Enter your choice");
			choice = scanner.nextInt();
			scanner.nextLine(); //Im training for coding assessments at the moment and i learned that if you dont use this when messing with reading ints before strings you can get into a lot of trouble
			
			if (choice == 1) {
				System.out.print("Please enter your string: ");
				String input = scanner.nextLine();
				stack.push(input);
			}
			else if (choice == 2) {
				if(stack.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Pop complete" + stack.pop());
			}
			else if (choice == 3) {
				if(stack.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("The top of the stack is " + stack.peek());
			}
			else if (choice == 4) {
				if(stack.isEmpty())
					System.out.println("Stack is empty");
				else
					stack.popAll();
			}
			else if (choice == 5) {
				System.out.println("Enter a String");
				String balanceCheck = scanner.nextLine();
				
				if(isBalanced(balanceCheck)) {
					System.out.println("The brackets are balanced");
				}
				else 
					System.out.println("The brackets arent balanced");
				
			}
			else if (choice == 6) {
				System.out.println("Thank you, bye");
			}
			else
				System.out.println("Please enter a valid option");
			if (choice >= 1 && choice <= 6) {
				System.out.println("The current stack");
				stack.displayStack();
			}
		}
	}

}
