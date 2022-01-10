package com.study.ocp.day03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class CheckId {

	public static void main(String[] args) {
		System.out.println("請輸入真分證字號");
		String id =  new Scanner(System.in).next();
		System.out.println(id);
		int[] nums = new int[11];
		//System.out.println(id.charAt(0));
		//System.out.println(id.charAt(1));
		//int x = id.charAt(1); //49
		//System.out.println(x-48); // char轉int 會是AS碼
		for(int i = 1 ; i < id.length() ; i++) {
			nums[i+1] = id.charAt(i)-48;
		}
		System.out.println("char改成int num[i]-48:"+Arrays.toString(nums));
		switch(id.charAt(0)) {
		  case 'A' :
			  nums[0] = 1; nums[1] = 0;
			  break;
		  case 'F' :
			  nums[0] = 1; nums[1] = 5;
			  break;
		  }
		System.out.println(Arrays.toString(nums));
		//驗證
		int[] m = {1,9,8,7,6,5,4,3,2,1,1};
		System.out.println("驗證碼:"+Arrays.toString(m));
		int sum = 0;
		//nums 與 m 依序相乘
		for(int i =0; i<nums.length;i++) {
			sum += nums[i] * m[i];
		}
		System.out.println(sum);
		
		if (!(sum % 10 == 0)) {
			System.out.println("無效身分證");
		}
		System.out.println("有效身分證");
	}
	
}
