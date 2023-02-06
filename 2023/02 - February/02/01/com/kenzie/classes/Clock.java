// Clock.java
package com.kenzie.classes;

public class Clock {
	// Properties
	private int hour;
	private int minute;
	private String period;
	private String timeZone;

	// Default Constructor
	public Clock() {
		this(12, 0, "AM", "Eastern");
	}

	// Parameterized Constructor
	public Clock(int hour, int minute, String period, String timeZone) {
		// Validate Hour
		if (hour < 1 || hour > 12) {
			hour = 12;
		}
		// Validate Minutes
		if (minute < 0 || minute > 59) {
			minute = 0;
		}
		// Validate Period
		if (!(period.equals("AM") || period.equals("PM"))) {
			period = "AM";
		}
		// Validate TimeZone
		if (!(timeZone.equals("Eastern") || timeZone.equals("Central") 
			|| timeZone.equals("Mountain") || timeZone.equals("Pacific"))) {
				timeZone = "Eastern";
		}

		this.hour = hour;
		this.minute = minute;
		this.period = period;
		this.timeZone = timeZone;
	}

	// Getters
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public String getPeriod() {
		return period;
	}

	public String getTimeZone() {
		return timeZone;
	}

	// Setters
	public boolean setHour(int hour) {
		if (hour >= 1 && hour <= 12) {
			this.hour = hour;
			return true;
		}
		return false;
	}

	public boolean setMinute(int minute) {
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
			return true;
		}
		return false;
	}

	public boolean setPeriod(String period) {
		if (period.equals("AM") || period.equals("PM")) {
			this.period = period;
			return true;
		}
		return false;
	}

	public boolean setTimeZone(String timeZone) {
		if (timeZone.equals("Eastern") || timeZone.equals("Central") 
			|| timeZone.equals("Mountain") || timeZone.equals("Pacific")) {
				this.timeZone = timeZone;
				return true;
		}
		return false;
	}
}
