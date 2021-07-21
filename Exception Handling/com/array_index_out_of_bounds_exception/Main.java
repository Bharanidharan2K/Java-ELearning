package com.array_index_out_of_bounds_exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[100];
		System.out.println("Enter the number of seats to be booked:");
		int noOfSeats = Integer.parseInt(br.readLine());
		try {
			for(int i=0, index=1; i<noOfSeats; i++) {
				System.out.println("Enter the seat number "+index++);
				Integer seat = Integer.parseInt(br.readLine());
				if(seat > 100) throw (new ArrayIndexOutOfBoundsException());
				a[i] = seat;
			}
			System.out.println("The seats booked are:");
			for(int i=0; i<noOfSeats;i++) {
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e+ ": 100");
		}
		
		br.close();
	}

}
