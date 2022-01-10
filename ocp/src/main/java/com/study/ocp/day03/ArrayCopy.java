package com.study.ocp.day03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] num1 = {100,90,80};
		System.out.println(Arrays.toString(num1));
		//Arrays.copyof(目標 , 長度)
		int[] num3 = Arrays.copyOf(num1, num1.length);
		System.out.println(Arrays.toString(num3));
		//System.arraycopy()
		int[] num4 = new int[10];
		
		//               目標 起點 複製方 起點 要複製的長度 
		System.arraycopy(num1, 0, num4,  0,  num1.length);
		
		// clone()
		int[] num5 = num1.clone();
		System.out.println(Arrays.toString(num5));
		
		
		
		
	}
	
}
