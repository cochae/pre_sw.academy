package com.ycw.arraylist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<E> implements List<E>, Iterable<E>{
	
	private class Node<E> {
		private Node<E> next;
		private Node<E> prev;
		private E data;
		
		private Node(E element) {
			this.data = element;
			this.next = null;
			this.prev = null;
		}
	}
	
	private int size;
	private Node<E> head;
	private Node<E> tail;

	@Override
	public void add(E element) {
		Node<E> node = new Node<E>(element);

		if(head == null) {
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		size++;
	}

	@Override
	public void add(int index, E element) {
		checkBoundInclusive(index);
		if(index == size) {
			add(element);
			return;
		}
		else {
			Node<E> node = new Node<E>(element);
			Node<E> x = head;
			for(int i = 0; i < index; i++) {
				x = x.next;
			}
			if(index == 0) {
				node.prev = x.prev; //  == null / 필수?
				x.prev = node;
				node.next = x;
				head = node;
			}
			else { 
				x.prev.next = node;
				node.prev = x.prev;
				node.next = x;
				x.prev = node;
			}
			size++;
		}
	}

	@Override
	public E get(int index) {
		checkBoundExclusive(index);
		Node<E> x = head;
		for(int i = 0; i < index; i++) {
			x = x.next;
		}
		return x.data;
	}
	

	@Override
	public E remove(int index) {
		checkBoundExclusive(index);
		E r = get(index);
		
		Node<E> x = head;
		for(int i = 0; i < index; i++) {
			x = x.next;
		}
		
		if(index == 0){
			if(size == 1) {
				head = null;
				tail = x.prev;
			}
			else {
				x.next.prev = null;
				head = x.next;
			}
		}
		else if(x == tail) {
			x.prev.next = x.next;
			tail = x.prev;
		}
		else {
			x.prev.next = x.next;
			x.next.prev = x.prev;
		}
		size--;
		return r;
		
	}

	@Override
	public void removeAll() {
		Node<E> x = head;
		while(x.next != null) {
			Node<E> next = x.next;
			x.next = null;
			x.prev = null;
			x = next;
		}
		head = null;
		tail = null;
		size = 0;
 	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Iterator<E> iterator(){

		return new Iterator<E>() {
			private Node<E> pos = head;
			@Override
			public boolean hasNext() {
				return (pos != null);
			}

			@Override
			public E next() {
				if(pos == null) {
					throw new NoSuchElementException();
				}
				E data = pos.data;
				pos = pos.next;
				return data;
			}
			
		};
	}
	private void checkBoundInclusive(int index) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
		}
	}
	
	private void checkBoundExclusive(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
		}
	}

	
}
