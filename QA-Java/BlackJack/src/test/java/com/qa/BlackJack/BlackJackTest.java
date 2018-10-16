package com.qa.BlackJack;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlackJackTest {

	@Test
	public void InstatnceTest() {
		BlackJack cards = new BlackJack();
		assertTrue(cards instanceof BlackJack);
	}

	@Test
	public void nullTest() {
		BlackJack cards = new BlackJack();
		assertNotNull(cards);
	}

	@Test
	public void MaxTest() {
		final int maxNum = 22;
		assertEquals(maxNum, BlackJack.getMaxnum());
	}

	@Test
	public void MinTest() {
		final int minNum = 2;
		assertEquals(minNum, BlackJack.getMinnum());
	}

	@Test
	public void isBustTest() {
		BlackJack cards = new BlackJack();
		assertTrue(cards.isBust(24));
	}

	@Test
	public void gameTest() {
		BlackJack cards = new BlackJack();

		assertEquals(10, cards.play(10, 22));
	}

	@Test
	public void gameTest2() {
		BlackJack cards = new BlackJack();

		assertEquals(17, cards.play(10, 17));
	}

	@Test
	public void isImposibleTest() {
		BlackJack cards = new BlackJack();

		assertTrue(cards.isImpossible(1));
	}
	
	@Test
	public void gameTest3() {
		BlackJack cards = new BlackJack();

		assertEquals(0, cards.play(0, 17));
	}

}