package com.binarysearch;

import java.util.Comparator;

public class EmailComparator implements Comparator<User>{

	@Override
	public int compare(User a, User b) {
		return -a.getEmail().compareTo(b.getEmail());
	}

}
