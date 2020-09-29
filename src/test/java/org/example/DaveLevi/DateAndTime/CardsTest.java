package org.example.DaveLevi.DateAndTime;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

public class CardsTest {

    @Test
    public void CardTest() {
        Card threeOfclubs = new Card(3, 0);
        Card aceOfHearts = new Card(1, 2);
        System.out.println(threeOfclubs.toString());
        System.out.println(aceOfHearts.toString());
    }

    @Test
    public void compareCards() {
        Card threeOfclubs = new Card(3, 0);
        Card AnotherThreeOfClubs = new Card(3, 0);
        System.out.println(threeOfclubs.equals(AnotherThreeOfClubs));
        if (threeOfclubs.equals(AnotherThreeOfClubs)) {
            System.out.println("These 2 cards are the same!");
        } else {
            System.out.println("These 2 cards are NOT the same!");
        }
        Card[] deck = makeADeck();
/*
        for (Card card : deck) {
            System.out.print(Card.binarySearch(deck, card));
        }
*/
        for (int i = 0; i < deck.length; i++) {
            System.out.print(Card.binarySearch(deck, deck[i]));
            System.out.println(" = " + deck[i].toString());
        }

    }
    public Card[] makeADeck(){
        Card[] theDeck = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                theDeck[index] = new Card(rank, suit);
                index++;
            }
        }
        return theDeck;
    }

    void deckToPrintln(Card[] deck){
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
    }

    int searchCards(Card[] deck, Card target) {
        for (int i = 0; i < deck.length; i++) {
            if (deck[i].equals(target)) {
                return i;
            }
        }
        return -1;        
    }

    @Test
    public void deckTests() {
        Card[] theDeck = makeADeck();
        if (theDeck[0] == null) {
            System.out.println("No cards yet!");
        }
        deckToPrintln(theDeck);
    }
}