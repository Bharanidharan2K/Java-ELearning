package com.export_booking_details;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class ExportBooking implements Export{

	SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	public String exportJSON(List<TicketBooking> bookings) {
		Iterator<TicketBooking> it = bookings.iterator();
		String dummy = "[\n";
		while(it.hasNext()) {
			TicketBooking t = (TicketBooking) it.next();
			dummy = dummy+"{\n\"customer\" : \""+t.getCustomer()+"\",\n\"price\" : "+t.getPrice()+",\n\"bookingTime\" : \""+sd.format(t.getBookingTime())+"\",\n\"stageEventShow\" : \""+t.getStageEventShow()+"\"\n}" ;
			if(it.hasNext())
				dummy = dummy+",\n";
		}
		dummy = dummy+"\n]";
		return dummy;
	}

	public String exportCSV(List<TicketBooking> bookings) {
		System.out.println("customer,price,bookingTime,stageEventShow");
		String dummy = "";
		for(TicketBooking i : bookings) {
			dummy = dummy+i.getCustomer()+","+i.getPrice()+","+sd.format(i.getBookingTime())+","+i.getStageEventShow()+"\n";
		}
		return dummy;
	}

}
