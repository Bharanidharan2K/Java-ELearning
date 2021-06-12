package com.bo_classes;

import java.util.Date;

public class ItemTypeBO {
	public Double calculateCost(Date start,Date end,ItemType typeIns) {
		long time = end.getTime() - start.getTime();
		int day = (int)time/(1000*60*60*24);
		return day*typeIns.getCostPerDay();
	}
}
