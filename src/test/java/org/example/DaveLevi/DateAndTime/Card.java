package org.example.DaveLevi.DateAndTime;

public class Card {
    private int rank;
    private int suit;
    public static final String[] ranks = {"null","Ace","2","3",
            "4","5","6","7","8","9","10","Jack","Queen","King"};
    public static final         String[] suits = {"Clubs",
            "Diamonds","Hearts","Spades"};

    public Card(int rank, int suit) {
    this.rank = rank;
    this.suit = suit;
    }

    public String toString() {
        String cardString = "" + ranks[this.rank] + " of " + suits[this.suit];
        return cardString;
    }
}