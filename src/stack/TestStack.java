package stack;

public class TestStack {
	
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
	}

}
