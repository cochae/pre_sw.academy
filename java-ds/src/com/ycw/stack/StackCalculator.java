package com.ycw.stack;

public class StackCalculator {
	private String infix;
	private StringBuilder builder;
	private String postfix;
	
	public StackCalculator(String infix) {
		this.infix = infix;
		this.builder = new StringBuilder();
	}
	
	private String infixToPostfix() {
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
	
	private int comparePriority(char a, char b) {
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
	
	public int solve() {
		String s = infixToPostfix();
		LLStack<Integer> stack = new LLStack<>();
		char[] array = s.toCharArray();
		for(int i = 0; i < array.length; i++) {
			if(array[i] >= '0' && array[i] <= '9') {
				stack.push(array[i] - '0');
			}
			else {
				int b = stack.pop();
				int a = stack.pop();
				switch(array[i]) {
			
				case '+': stack.push(a + b); break;
				case '-': stack.push(a - b); break;
				case '*': stack.push(a * b); break;
				case '/': stack.push(a / b); break;
				}
			}
		}

		return stack.pop();
	}
	
}