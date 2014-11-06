package com.guyroyse.poker;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class EmptyHandTest {

	@Test
	public void itComparesHandsAsEqual() {
		Hand left = new Hand();
		Hand right = new Hand();
		assertThat(left, comparesEqualTo(right));
	}
}
