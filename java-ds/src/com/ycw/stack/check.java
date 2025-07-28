package com.ycw.stack;

public class check {
	public static void main(String[] args) {
		String expression = "()";
		System.out.println(checkMatch(expression));
	}
		
//		expression = "[ a { b + c - ( a * 3 ) + 4 ]";
//		System.out.println(checkMatch(expression));	
//		}

	public static boolean checkMatch(String expression) {
		
		char[] arr = expression.toCharArray();
		
		boolean retVal = true;
		LLStack<Character> stack = new LLStack<Character>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '[' || arr[i] == '{' || arr[i] == '(')
				stack.push(arr[i]);
			else {
				switch (arr[i]) {
				case '}':
					if (stack.empty() || stack.pop() != '{')
						retVal = false;
					break;
				case ']':
					if (stack.empty() || stack.pop() != '[')
						retVal = false;
					break;
				case ')':
					if (stack.empty() || stack.pop() != '(')
						retVal = false;
					break;
				}
				if (!retVal)
					return retVal;

			}
		}
		if (!stack.empty())
			retVal = false;

		return retVal;
	}
}
