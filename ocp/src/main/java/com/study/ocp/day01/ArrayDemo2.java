package com.study.ocp.day01;

import java.util.Iterator;

public class ArrayDemo2 {

	public static void main(String[] args) {
        int[] poker = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        //印出poker
        for(int x : poker) {
        	System.out.print(x+" ");
        }
        System.out.println("");
        for(int i =poker.length-1 ; i>=0 ; i--){
        	System.out.printf("%d ",poker[i]);
        }
        
	}
}
