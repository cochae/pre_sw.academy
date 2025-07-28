package com.ycw.stack;

import com.ycw.arraylist.DoublyLinkedList;

public class LLStack<E> extends DoublyLinkedList<E> {
	public void push(E item) {
		add(item);
	}
	
	public E pop() {
		if(size() == 0) {
			throw new StackException("stack is empty");
		}
		return remove(size() - 1);
	}
	
	public E peek() {
		return get(size() - 1);
	}
	
	public boolean empty() {
		return size() == 0;
	}
}
