package com.study.ocp.day03;

public class StringEquals {

	public static void main(String[] args) {
		String s1 = new String("Java"); // new 宣告(內容永不改變)
		String s2 = new String("Java"); // new 宣告(內容永不改變)
		// String pool 節省記憶體
		String s3 = "Java"; // String pool(字面值宣告)
		String s4 = "Java"; // String pool(字面值宣告)
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1 == s2); 
		System.out.println(s3 == s4);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equalsIgnoreCase(s4));
	}
	
}
