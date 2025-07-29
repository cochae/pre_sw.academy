package com.ycw.stack;

public class InToPost {
	public static void main(String[] args) {
//			3 + 2 * 4			==> 324*+
//			2 * 4 + 3			==> 24*3+
//			2 * 1 + 3 / 2		==> 21*32/+
//			2 * 2 / 3			==> 22*3/     
//
//
//			(1 * 2  + 3 ) / 4			==> 12*3+4/
//			(1 + 2  * 3 ) / 4			==> 123*+4/
//			2 * 3 * ( 2 + 4 ) + 10		==> 2 3 * 2 4 + * 10 +
//			(1+2)*(3/4)+(5+(6-7))  		==> 12+34/*567-++

//			String infix = "2 * 4 + 3";
//		String infix = "1 + 2 / 3 * 4";
//		System.out.println(infixToPostfix(infix));
		
		String infix = "1+2/3*4*5";
		System.out.println(infixToPostfix(infix));

	}

	public static String infixToPostfix(String infix) {
		LLStack<Character> stack = new LLStack<Character>();
		char[] arrayExpression = infix.toCharArray();
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < arrayExpression.length; i++) {
			if (arrayExpression[i] == '(') {
				stack.push(arrayExpression[i]);
			}else if (arrayExpression[i] >= '0' && arrayExpression[i] <= '9') {
				builder.append(arrayExpression[i]);
			}else if(arrayExpression[i] == ')') {
				while (stack.peek() != '(') {
					builder.append(stack.pop());
				}
				stack.pop();
			} else {
				if (stack.empty() ||  stack.peek() == '(') {
					stack.push(arrayExpression[i]);
				}else if (comparePriority(arrayExpression[i], stack.peek()) > 0) {
					stack.push(arrayExpression[i]);
				}else {
					while (stack.size() != 0 && stack.peek() != '(') {
						builder.append(stack.pop());
					}
					stack.push(arrayExpression[i]);
				}
			}
		}
		while (stack.size() != 0) {
			builder.append(stack.pop());
		}
		return builder.toString();
	}
	
	private static int comparePriority(char a, char b) {
		if (a == '*' || a == '/') {
			if (b == '*' || b == '/') {
				return 0;
			}else {
				return 1;
			}
		}else {
			if (b == '*' || b == '/') {
				return -1;
			}else {
				return 0;
			}
		}
	}
}
	
	
