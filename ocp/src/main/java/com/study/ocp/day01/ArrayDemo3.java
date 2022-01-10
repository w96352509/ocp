package com.study.ocp.day01;

public class ArrayDemo3 {

	public static void main(String[] args) {
        int[] p1 = {10,20};
        int[] p2 = {30,50};
        //求二點間距離
        double x = Math.pow(p1[0]-p2[0],2);
	    double y = Math.pow(p1[1]-p2[1],2);
	    double z = Math.sqrt(x+y);
	    System.out.printf("%.2f",z);
	    
	}
}
