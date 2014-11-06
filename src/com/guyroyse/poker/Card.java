package com.guyroyse.poker;

public class Card {

	private Suit suit;
	private Rank rank;

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setRank(Rank rank) {
		this.rank = rank;

	}

	public Rank getRank() {
		return rank;
	}
}
