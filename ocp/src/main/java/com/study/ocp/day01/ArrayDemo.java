package com.study.ocp.day01;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayDemo {
  public static void main(String[] args) {
	int[] scores = {100, 80, 90};
	System.out.println(scores[0]);
	System.out.println(scores[1]);
	System.out.println(scores[2]);
	System.out.println(scores[0]+scores[1]+scores[2]);
    System.out.println(scores.length);
    // Arrays 陣列補充包
    System.out.println(Arrays.toString(scores));
    System.out.println(Arrays.stream(scores).sum());
    // 利用forloop
    int sum = 0;
    for(int i=0; i<scores.length;i++) {
    	System.out.println(scores[i]);
    	sum +=scores[i];
    }
    System.out.println(sum);
    // for each
    for(int i : scores) {
    	System.out.print(i+",");
    }
  }
}
