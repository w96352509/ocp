package com.study.ocp.day03;

public class StringAndStringBuilder {

	public static void append(String str) {
		str = str + "8"; //丟到 append 的 str
	}
	
	public static String add(String str) {
		str = str + "8"; 
		return str;
	}
	
	public static void append(StringBuilder sb) {
		sb.append("8");
	}
	
	public static void main(String[] args) {
		String str = "Java" ; 
		StringBuilder sb = new StringBuilder("Java");
		append(str);
		append(sb);
		System.out.println(str); 
		 str = add(str); //接收回傳值
		System.out.println(str);
		System.out.println(sb);
	}
	
}
