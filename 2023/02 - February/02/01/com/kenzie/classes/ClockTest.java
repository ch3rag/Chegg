package com.kenzie.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

	public static Clock clock1;
	public static Clock clock2;
	public static Clock clock3;

	public static Clock getTestClock() {
		return new Clock();
	}

	public static Clock getTestClock(int hour, int minute, String period, String timeZone) {

		return new Clock(hour, minute, period, timeZone);
	}

	@BeforeEach
	public void setup() {

		clock1 = getTestClock();
		clock2 = getTestClock(3, 15, "PM", "Central");
		clock3 = getTestClock(15, 65, "morning", "new york");
	}

	@Test
	void canCreateDefaultClock() {
		assertEquals(12, clock1.getHour(), "Constructor default test: Hour=12");
		assertEquals(0, clock1.getMinute(), "Constructor default test: minute=0");
		assertEquals("AM", clock1.getPeriod(), "Constructor default test: period = AM");
		assertEquals("Eastern", clock1.getTimeZone(), "Constructor default test: time zone = Eastern");
	}

	@Test
	void canCreateClock() {
		// clock2 - correct values entered
		assertEquals(3, clock2.getHour(), "Constructor value test: Hour=3");
		assertEquals(15, clock2.getMinute(), "Constructor value test: minute=15");
		assertEquals("PM", clock2.getPeriod(), "Constructor value test: period = AM");
		assertEquals("Central", clock2.getTimeZone(), "Constructor value test: time zone = Eastern");

		// clock3 - incorrect values leads to default values
		assertEquals(12, clock3.getHour(), "Constructor invalid test: Hour=12");
		assertEquals(0, clock3.getMinute(), "Constructor invalid test: minute=0");
		assertEquals("AM", clock3.getPeriod(), "Constructor invalid test: period = AM");
		assertEquals("Eastern", clock3.getTimeZone(), "Constructor invalid test: time zone = Eastern");

	}

	@Test
	void canSetHour() {
		clock1.setHour(10);
		assertEquals(10, clock1.getHour(), "setHour test: hour valid set to 10");

		clock1.setHour(0);
		assertEquals(10, clock1.getHour(), "setHour test: invalid remains 10");
	}

	@Test
	void canSetMinute() {
		clock1.setMinute(10);
		assertEquals(10, clock1.getMinute(), "setMinute test: minute valid set to 10");
		clock1.setMinute(0);
		assertEquals(0, clock1.getMinute(), "setMinute test: minute valid set to 0");

		clock1.setMinute(100);
		assertEquals(0, clock1.getMinute(), "setMinute test: minute invalid remains 0");

	}

	@Test
	void canSetPeriod() {
		clock1.setPeriod("PM");
		assertEquals("PM", clock1.getPeriod(), "setPeriod test: period valid set to PM");
		clock1.setPeriod("AM");
		assertEquals("AM", clock1.getPeriod(), "setPeriod test: period valid set to AM");

		clock1.setPeriod("night time");
		assertEquals("AM", clock1.getPeriod(), "setPeriod test: period invalid remains AM");
	}

	@Test
	void canSetTimeZone() {
		clock1.setTimeZone("Mountain");
		assertEquals("Mountain", clock1.getTimeZone(), "setTimeZone test: timeZone valid set to Mountain");
		clock1.setTimeZone("Central");
		assertEquals("Central", clock1.getTimeZone(), "setTimeZone test: timeZone valid set to Central");
		clock1.setTimeZone("Pacific");
		assertEquals("Pacific", clock1.getTimeZone(), "setTimeZone test: timeZone valid set to Pacific");
		clock1.setTimeZone("Eastern");
		assertEquals("Eastern", clock1.getTimeZone(), "setTimeZone test: timeZone valid set to Eastern");

		clock1.setTimeZone("Greenwich");
		assertEquals("Eastern", clock1.getTimeZone(), "setTimeZone test: timeZone invalid remains Eastern");

	}
}