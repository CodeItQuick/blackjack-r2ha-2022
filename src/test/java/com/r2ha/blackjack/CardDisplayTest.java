package com.r2ha.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardDisplayTest {

    private static final Suit DUMMY_SUIT = Suit.HEARTS;
    private static final Rank RANK_TEN = Rank.TEN;
    @Test
    public void displayTenAsString() {
        Card card = new Card(DUMMY_SUIT, RANK_TEN);
        assertThat(ConsoleCard.display(card))
                .isEqualTo("[31m┌─────────┐[1B[11D│10       │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│       10│[1B[11D└─────────┘");

    }
    @Test
    public void displayNonTenAsString() {
        Card card = new Card(DUMMY_SUIT, Rank.SEVEN);
        assertThat(ConsoleCard.display(card))
                .isEqualTo("\u001B[31m┌─────────┐\u001B[1B\u001B[11D│7        │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│    ♥    │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│        7│\u001B[1B\u001B[11D└─────────┘");

    }

}
