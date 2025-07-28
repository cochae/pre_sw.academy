package com.ycw.arraylist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements List<E>, Iterable<E> {
	private int size;
	private E[] data;
	
	private void resize() {
		if (size == 0) {
			data = (E[]) new Object[10];
		} else {
			E[] newData = (E[]) new Object[size + 10];
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}
	
	public MyArrayList() {
		size = 0;
		resize();
	}
	
	@Override
	public void add(E element) {
		if(data.length == size){
			resize();
		}
		data[size++] = element;
	}

	@Override
	public void add(int index, E element) {
		checkBoundInclusive(index);
		if(data.length == size){
			resize();
		}
//		for(int i = size - 1; i >= index; i--) {
//			data[i + 1] = data[i];
//		}
		if(index != size) {
			System.arraycopy(data, index, data, index + 1, size - index);
		}
		data[index] = element;
		size++;
	}

	@Override
	public E get(int index) {
		checkBoundExclusive(index);
		return data[index];
	}

	@Override
	public E remove(int index) {
		checkBoundExclusive(index);
		E r = data[index];
		if(index != --size)
			System.arraycopy(data, index + 1, data, index, size - index);
		return r;
	}

	@Override
	public void removeAll() {
		size = 0;
	}

	@Override
	public int size() {
		return size;
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

	@Override
	public Iterator<E> iterator() {
		
		return new Iterator<E>() {
			private int pos = 0;
			private int size = size();
			@Override
			public boolean hasNext() {
				return pos < size;
			}

			@Override
			public E next() {
				if(pos >= size) {
					throw new NoSuchElementException();
				}
				return data[pos++];
			}
			
		};
	}
}
