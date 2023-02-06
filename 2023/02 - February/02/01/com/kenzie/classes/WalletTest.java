package com.kenzie.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {
	public static Wallet wallet1;
	public static Wallet wallet2;
	public static Wallet wallet3;

	public static Wallet getTestWallet() {
		return new Wallet();
	}

	public static Wallet getTestWallet(String owner) {
		return new Wallet(owner);
	}

	public static Wallet getTestWallet(int numCreditCards, String owner, double totalCash) {
		return new Wallet(numCreditCards, owner, totalCash);
	}

	@BeforeEach
	public void setup() {

		wallet1 = getTestWallet();
		wallet2 = getTestWallet("Richie Rich");
		wallet3 = getTestWallet(2, "Scrooge", 1000.99);
	}

	@Test
	void canCreateDefaultWallet() {
		assertEquals("", wallet1.getOwner(), "Constructor default test: owner=\"\"");
		assertEquals(0, wallet1.getNumCreditCards(), "Constructor default test: numCreditCards=0");
		assertEquals(0, wallet1.getTotalCash(), "Constructor default test: totalCash = 0");

	}

	@Test
	void canCreateWallet() {
		// wallet2 - owner entered
		assertEquals("Richie Rich", wallet2.getOwner(), "Constructor value test: owner=Richie Rich");
		assertEquals(0, wallet2.getNumCreditCards(), "Constructor value test: numCreditCards=0");
		assertEquals(0, wallet2.getTotalCash(), "Constructor value test: totalCash = 0");

		// wallet3 - owner, numCreditCards, totalCash entered
		assertEquals("Scrooge", wallet3.getOwner(), "Constructor value test: owner=Richie Rich");
		assertEquals(2, wallet3.getNumCreditCards(), "Constructor value test: numCreditCards=0");
		assertEquals(1000.99, wallet3.getTotalCash(), "Constructor value test: totalCash = 0");

	}

	@Test
	void canSetNumCreditCards() {
		wallet1.setNumCreditCards(10);
		assertEquals(10, wallet1.getNumCreditCards(), "setNumCreditCards test: numCreditCards=10");

	}

	@Test
	void canSetOwner() {
		wallet1.setOwner("Minnie Mouse");
		assertEquals("Minnie Mouse", wallet1.getOwner(), "setOwner test: owner=Minnie Mouse");

	}

	@Test
	void canSetTotalCash() {
		wallet1.setTotalCash(3);
		assertEquals(3, wallet1.getTotalCash(), "setTotalCash number test: totalCash = 3");
		wallet1.setTotalCash(.99);
		assertEquals(.99, wallet1.getTotalCash(), "setTotalCash decimal test: totalCash = .99");
	}
}
