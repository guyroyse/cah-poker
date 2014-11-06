package com.guyroyse.poker;

import java.util.ArrayList;
import java.util.List;

public class Hand implements Comparable<Hand> {

	private List<Card> cards;

	public Hand() {
		cards = new ArrayList<Card>();
	}

	public int compareTo(Hand o) {
		return 0;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void addCard(Card card) {
		cards.add(card);
	}
}
