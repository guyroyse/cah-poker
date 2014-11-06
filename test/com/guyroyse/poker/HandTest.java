package com.guyroyse.poker;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class HandTest {

	@Test
	public void itHasNoCardsWhenCreated() {
		Hand hand = new Hand();
		assertThat(hand.getCards(), is(empty()));
	}

	@Test
	public void itHasACardWhenAdded() {
		Hand hand = new Hand();
		hand.addCard(new Card());
		assertThat(hand.getCards(), hasSize(1));
	}

	@Test
	public void itHasTheCorrectCardWhenAdded() {
		Hand hand = new Hand();
		Card card = new Card();
		hand.addCard(card);
		assertThat(hand.getCards().get(0), equalTo(card));
	}

	@Test
	public void itHasMultipleCardsWhenAdded() {
		Hand hand = new Hand();
		hand.addCard(new Card());
		hand.addCard(new Card());
		assertThat(hand.getCards(), hasSize(2));
	}

}
