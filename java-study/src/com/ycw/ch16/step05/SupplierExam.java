package com.ycw.ch16.step05;

import java.util.function.Supplier;

public class SupplierExam {
	public static void main(String[] args) {
		Supplier<String> lotto = () -> {
			int[] numbers = new int[6];
			StringBuilder builder = new StringBuilder();
			int index = 0, temp;
			
			while (index < 6) {
				temp= (int)(Math.random() * 45) + 1;
				
				// 이전에 생성한 번호와 동일한지 검사
				if(isExist(temp, index, numbers)) { 
					continue; // 이전에 생성한 번호와 동일한 경우, 다시 번호 생성
				}else {
					// 새로운 번호인 경우 저장
					numbers[index] = temp;
					index++;
				}
			}
			//생성한 번호를 문자열로 완성
			for(int i = 0; i < 6; i++) {
				builder.append(numbers[i] + " ");
			}
			return builder.toString();
		};
		
		System.out.println("로또 번호: " + lotto.get());
	}
	
	private static boolean isExist(int num, int index, int[] array) {
		boolean checked = false;
		for(int i = 0; i < index; i++) {
			if(array[i] == num) {
				checked = true;
				break;
			}
		}
		return checked;
	}
}
