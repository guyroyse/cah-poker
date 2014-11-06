package com.guyroyse.poker;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

	@Test
	public void itCanBeAllValidSuits() {
		assertSuitOf(Suit.Clubs);
		assertSuitOf(Suit.Diamonds);
		assertSuitOf(Suit.Hearts);
		assertSuitOf(Suit.Spades);
	}

	private void assertSuitOf(Suit suit) {
		Card subject = new Card();
		subject.setSuit(suit);
		assertThat(subject.getSuit(), equalTo(suit));
	}

	@Test
	public void itCanBeAllValidRanks() {
		assertRankOf(Rank.Ace);
		assertRankOf(Rank.Duece);
		assertRankOf(Rank.Three);
		assertRankOf(Rank.Four);
		assertRankOf(Rank.Five);
		assertRankOf(Rank.Six);
		assertRankOf(Rank.Seven);
		assertRankOf(Rank.Eight);
		assertRankOf(Rank.Nine);
		assertRankOf(Rank.Ten);
		assertRankOf(Rank.Jack);
		assertRankOf(Rank.Queen);
		assertRankOf(Rank.King);
	}

	private void assertRankOf(Rank rank) {
		Card subject = new Card();
		subject.setRank(rank);
		assertThat(subject.getRank(), equalTo(rank));
	}
}
