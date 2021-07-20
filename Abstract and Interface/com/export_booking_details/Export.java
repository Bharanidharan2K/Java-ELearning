package com.export_booking_details;

import java.util.List;

public interface Export {
	public String exportJSON(List<TicketBooking> bookings);
	public String exportCSV(List<TicketBooking> bookings);
}
