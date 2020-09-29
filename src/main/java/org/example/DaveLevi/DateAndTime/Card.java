package org.example.DaveLevi.DateAndTime;

public class Card {
    private int rank;
    private int suit;
    public static final String[] RANKS = {"null","Ace","2","3",
            "4","5","6","7","8","9","10","Jack","Queen","King"};
    public static final         String[] SUITS = {"Clubs",
            "Diamonds","Hearts","Spades"};

    public Card(){
    }

    public Card(int rank, int suit) {
    this.rank = rank;
    this.suit = suit;
    }

    public String toString() {
        return "" + RANKS[this.rank] + " of " + SUITS[this.suit];
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public boolean equals(Card that) {
        return this.rank == that.rank
                && this.suit == that.suit;
    }
    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit){
            return 1;
        }
        if (this.rank < that.rank){
            return -1;
        }
        if (this.rank > that.rank){
            return 1;
        }
        return 0;
    }

    public static int binarySearch(Card[] deck, Card target) {
        int low  = 0;
        int high = deck.length -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comp = deck[mid].compareTo(target);

            if (comp == 0) {
                return mid;
            } else if (comp < 0) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return -1;
    }
}