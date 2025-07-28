package com.ycw.stack;

public class StackExam {
	public static void main(String[] args) {
		try { 
			LLStack<String> stack = new LLStack<String>();
		
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("Java");
			stack.push(".");
			
			while(!stack.empty()) {
				String s = stack.pop();
				System.out.println(s);
			}
			System.out.println("======================");
			
			stack  = new LLStack<String>();
			
			stack.push("Hello");
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
		}catch(StackException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
