package com.big_bash_event;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Event {
	public static Object checkEventAvailable(String date) throws Exception {
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		Date d = sd.parse(date);
		int month = d.getMonth();
		month +=1;
		if(month %2 ==0)
			return d;
		else
			return "Not Eligible for BIGBASH event";
	}
	public static Double getAmountWithDiscount(Double amount, Date date) {
		int month = date.getMonth()+1;
		Double discount = (month*amount)/100;
		amount = amount - discount;
		return amount;
	}
}
