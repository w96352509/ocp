package com.study.ocp.day03;

import java.util.Arrays;
import java.util.Iterator;

public class StringDemo {

	public static void main(String[] args) {
        //字串 lenght() 有括號
		String words = "she sell sea shell on the sea shore";
		System.out.println("長度"+words.length());
		//去開頭尾的空白
		System.out.println(words.trim().length());
		//有沒有 on 找不到給 -1
		System.out.println("on 的位置在:"  + words.indexOf("on"));
		System.out.println("off 的位置在:"  + words.indexOf("off"));
		//有幾個字 ? 提示: split()
		//把空白分隔
		String[] wordArray = words.split(" ");
		System.out.println(Arrays.toString(wordArray));
		System.out.println(words.split(" ").length);
	}
}
