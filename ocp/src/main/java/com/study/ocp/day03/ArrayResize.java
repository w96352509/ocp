package com.study.ocp.day03;

import java.util.Arrays;

public class ArrayResize {

	public static void main(String[] args) {
		//靜態陣列
		int[] num1 = {100,90,80};
		System.out.println(Arrays.toString(num1));
		
		//Resize
		num1 = new int[]{100,90,80,70};
		System.out.println(Arrays.toString(num1));
		
	}
	
}
