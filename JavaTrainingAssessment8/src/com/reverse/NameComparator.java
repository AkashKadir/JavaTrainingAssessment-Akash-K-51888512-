package com.reverse;

import java.util.Comparator;

public class NameComparator implements Comparator<CallLog>{

	@Override
	public int compare(CallLog a, CallLog b) {
		return -a.getName().compareTo(b.getName());
	}
}
