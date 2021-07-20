package com.export_booking_details;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter the number of bookings:");
		Integer noOfBooking = Integer.parseInt(br.readLine());
		System.out.println("Enter the booking details:");
		List<TicketBooking> bookings = new ArrayList<>();
		for(int i=0; i<noOfBooking; i++) {
			String details[] = br.readLine().split("-");
			Date date = sd.parse(details[2]);
			TicketBooking ticketBooking = new TicketBooking(details[0], Double.parseDouble(details[1]), date, details[3]);
			bookings.add(ticketBooking);
		}
		System.out.println("Enter a type:\r\n" + 
				"1.JSON\r\n" + 
				"2.CSV");
		Integer choice = Integer.parseInt(br.readLine());
		if(choice == 1) {
			ExportBooking exportBooking = new ExportBooking();
			System.out.println(exportBooking.exportJSON(bookings));
		}
		else if(choice == 2) {
			ExportBooking exportBooking = new ExportBooking();
			System.out.println(exportBooking.exportCSV(bookings));
		}
		br.close();

	}

}
