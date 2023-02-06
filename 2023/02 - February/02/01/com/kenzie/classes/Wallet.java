// Wallet.java

package com.kenzie.classes;

public class Wallet {
	// Properties Declarations
	private int  numCreditCards;
	private String owner;
	private double totalCash;

	// Default Constructor
	public Wallet() {
		this("");
	}

	// Parametrized Constructors
	public Wallet(String owner) {
		this(0, owner, 0);
	}

	public Wallet(int numCreditCards, String owner, double totalCash) {
		this.owner = owner;
		this.numCreditCards = numCreditCards;
		this.totalCash = totalCash;
	}

	// Getters
	public String getOwner() {
		return owner;
	}
	
	public int getNumCreditCards() {
		return numCreditCards;
	}

	public double getTotalCash() {
		return totalCash;
	}

	// Setters
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setNumCreditCards(int numCreditCards) {
		this.numCreditCards = numCreditCards;
	}

	public void setTotalCash(double totalCash) {
		this.totalCash = totalCash;
	}
}
