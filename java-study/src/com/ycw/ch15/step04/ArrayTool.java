package com.ycw.ch15.step04;

public class ArrayTool {
	public <T> boolean compareArrays(T[] array1, T[] array2) {
		if(array1.length != array2.length) {
			return false;
		}
		
		for(int i = 0; i < array1.length; i++) {
			if(!array1[i].equals(array2[i])) {
				return false;
			}
		}
		return true;
	}
}
