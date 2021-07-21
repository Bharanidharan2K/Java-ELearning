package com.input_mismatch_exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter an integer input");
			Integer input = Integer.parseInt(br.readLine());
			System.out.println("Enter value is "+input);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		br.close();
	}

}
