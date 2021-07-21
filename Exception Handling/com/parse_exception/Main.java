package com.parse_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
			System.out.println("Enter the stage event start date and end date");
			Date startDate = sd.parse(br.readLine());
			Date endDate = sd.parse(br.readLine());
			System.out.println("Start date:"+sd.format(startDate));
			System.out.println("End date:"+sd.format(endDate));
		}
		catch(ParseException e) {
			System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
		}
		br.close();
	}

}
