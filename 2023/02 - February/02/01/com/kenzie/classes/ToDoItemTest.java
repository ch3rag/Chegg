package com.kenzie.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoItemTest {
	public static ToDoItem item1;
	public static ToDoItem item2;

	public static ToDoItem getTestToDoItem() {
		return new ToDoItem();
	}

	public static ToDoItem getTestToDoItem(String description, String priority) {
		return new ToDoItem(description, priority);
	}

	@BeforeEach
	public void setup() {
		item1 = getTestToDoItem();
		item2 = getTestToDoItem("walk the cat", "high");
	}

	@Test
	void canCreateDefaultToDoItem() {
		assertEquals("", item1.getDescription(), "Constructor default test: description=\"\"");
		assertEquals("", item1.getPriority(), "Constructor default test: priority=\"\"");
		assertEquals(false, item1.getIsDone(), "Constructor default test: isDone =false");
	}

	@Test
	void canCreateToDoItem() {
		// item2 - description, priority entered
		assertEquals("walk the cat", item2.getDescription(), "Constructor value test: description=walk the cat");
		assertEquals("high", item2.getPriority(), "Constructor value test: priority=high");
		assertEquals(false, item2.getIsDone(), "Constructor value test: isDone =false");
	}

	@Test
	void setDescription() {
		item2.setDescription("Do java homework");
		assertEquals("Do java homework", item2.getDescription(), "setDescription test: description=Do java homeworkt");
	}

	@Test
	void setPriority() {
		item2.setPriority("low");
		assertEquals("low", item2.getPriority(), "setPriority test: priority=low");

	}

	@Test
	void setIsDone() {
		item2.setIsDone(true);
		assertEquals(true, item2.getIsDone(), "setIsDone: isDone =true");

	}
}