package com.ycw.ch15.step04;

public class CompareExam {

	public static void main(String[] args) {
		Integer[] arr1 = {1, 2, 3, 4};
		Integer[] arr2 = {1, 2, 3, 4};
		Integer[] arr3 = {1, 2, 3, 4};
		String[] arr4 = {"Java", "Web"};
		String[] arr5 = {"JavaScript", "Web"};
		String[] arr6 = {"Java", "Web"};
		
		ArrayTool arrayTool = new ArrayTool();
		System.out.println("Compare arr1 and arr2: " + arrayTool.<Integer>compareArrays(arr1, arr2));
		System.out.println("Compare arr1 and arr3: " + arrayTool.<Integer>compareArrays(arr1, arr3));
		System.out.println("Compare arr4 and arr5: " + arrayTool.<String>compareArrays(arr4, arr5));
		System.out.println("Compare arr4 and arr6: " + arrayTool.<String>compareArrays(arr4, arr6));
	}

}
