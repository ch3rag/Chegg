package com.kenzie.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {
	public static ToDoList toDoList1;
	public static ToDoList toDoList2;

	public static ToDoList getTestToDoList() {
		return new ToDoList();
	}

	public static ToDoList getTestToDoList(String listName, int maxItems) {
		return new ToDoList(listName, maxItems);
	}

	@BeforeEach
	public void setup() {
		toDoList1 = getTestToDoList();
		toDoList2 = getTestToDoList("personal errands", 10);
	}

	@Test
	void canCreateDefaultToDoItem() {
		assertEquals("", toDoList1.getListName(), "Constructor default test: listName=\"\"");
		assertEquals(10, toDoList1.getMaxItems(), "Constructor default test: maxItems=10");
		assertNotNull(toDoList1.getItemList(), "Constructor default test: ItemList not null");
	}

	@Test
	void canCreateToDoItem() {
		// toDoList2 - listName, maxItems entered
		assertEquals("personal errands", toDoList2.getListName(), "Constructor value test: listName=personal errands");
		assertEquals(10, toDoList2.getMaxItems(), "Constructor value test: maxItems=10");
		assertNotNull(toDoList2.getItemList(), "Constructor default test: ItemList not null");
	}

	@Test
	void setListName() {
		toDoList1.setListName("weekend checklist");
		assertEquals("weekend checklist", toDoList1.getListName(), "setListName test: listName=weekend checklist");

	}

	@Test
	void setMaxItems() {
		toDoList1.setMaxItems(100);
		assertEquals(100, toDoList1.getMaxItems(), "setMaxItems test: maxItems=100");
	}

	@Test
	void canSetItemList() {
		ToDoItem item1 = new ToDoItem("buy cake", "high");
		ToDoItem item2 = new ToDoItem("do decorations", "low");
		ToDoItem item3 = new ToDoItem("send invitations", "medium");

		ArrayList<ToDoItem> partyList = new ArrayList<>();
		partyList.add(item1);
		partyList.add(item2);
		partyList.add(item3);

		toDoList1.setItemList(partyList);
		assertEquals(partyList, toDoList1.getItemList(), "setItemList test: size=3");
	}
}