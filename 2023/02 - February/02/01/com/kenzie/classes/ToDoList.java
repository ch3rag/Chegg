// ToDoList.java

package com.kenzie.classes;

import java.util.ArrayList;

// ToDoList Class
public class ToDoList {
	// Properties
	private String listName;
	private int maxItems;
	private ArrayList<ToDoItem> ItemList;
	
	// Default Constructor
	public ToDoList() {
		this("", 10);
	}

	// Parameterized Constructor
	public ToDoList(String listName, int maxItems) {
		this.listName = listName;
		this.maxItems = maxItems;
		this.ItemList = new ArrayList<ToDoItem>();
	}

	// Getters
	public ArrayList<ToDoItem> getItemList() {
		return ItemList;
	}

	public int getMaxItems() {
		return maxItems;
	}

	public String getListName() {
		return listName;
	}

	// Setters
	public void setItemList(ArrayList<ToDoItem> itemList) {
		this.ItemList = itemList;
	}

	public void setMaxItems(int maxItems) {
		this.maxItems = maxItems;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}
}

// ToDoItem Class
class ToDoItem {
	// Properties
	private String description;
	private String priority;
	private boolean isDone;

	// Default Constructor
	public ToDoItem() {
		this("", "");
	}

	// Parametrized Constructor
	public ToDoItem(String description, String priority) {
		this.description = description;
		this.priority = priority;
		this.isDone = false;
	}

	// Getters
	public String getDescription() {
		return description;
	}

	public String getPriority() {
		return priority;
	}

	public boolean getIsDone() {
		return isDone;
	}

	// Setters
	public void setDescription(String description) {
		this.description = description;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public void setIsDone(boolean isDone) {
		this.isDone = isDone;
	}
}
