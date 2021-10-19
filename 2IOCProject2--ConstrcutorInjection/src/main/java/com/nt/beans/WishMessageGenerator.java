//WishMessageGenerator.java (Target Class)

package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	// Has-A property
	private Date date;

	//Constructor  method for constructor injection
	public WishMessageGenerator(Date date) {
		this.date = date;
	}

	// B. logic
	public String generate(String user) {
		// get hour of the day
		int hour = date.getHours();

		// generate wish message
		if (hour < 12) {
			return "Good Morning : " + user;
		} else if (hour < 16) {
			return "Good Afternoon : " + user;
		} else if (hour < 20) {
			return "Good Evening : " + user;
		} else {
			return "Good Night : " + user;
		}

	}

}