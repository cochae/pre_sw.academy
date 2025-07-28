package com.ycw.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextLine();
        }
        
        Arrays.sort(arr);
        Arrays.sort(arr, (a, b) -> a.length() - b.length());

        
        List<String> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i = 0; i < n-1; i++){
        	if(!arr[i+1].equals(arr[i])) {
        		list.add(arr[i + 1]);
        	}
        }
        for(int i = 0; i < list.size(); i++){
             System.out.println(list.get(i));
    
        }

    }
}