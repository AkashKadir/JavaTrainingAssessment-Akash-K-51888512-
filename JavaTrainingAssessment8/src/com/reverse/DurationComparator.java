package com.reverse;

import java.util.Comparator;

public class DurationComparator implements Comparator<CallLog> {

	@Override
	public int compare(CallLog a, CallLog b) {
		if(a.getDuration()>b.getDuration()) {
			return 1;
		}
		else if(a.getDuration()<b.getDuration()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
