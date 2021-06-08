package com.art_competition;

public class EnrollNumbers {
	public void printNumbers(int n) {
		if(n>0){
	        printNumbers(n-1);
	        System.out.print(n+" ");
	    }
	    return;
	}
}
