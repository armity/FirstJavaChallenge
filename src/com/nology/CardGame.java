package com.nology;

import java.util.*;

public class CardGame {
    private String name;
    ArrayList<Card> tempCardDeck = new ArrayList<>();

    public CardGame(String name) {
        this.name = name;
        getDeck();
    }

    public void getDeck(){

//        String [] suit = {"Hearts", "Club", "Diamonds", "Spade"};
        String [] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
//        int[] value = { 2,3,4,6,5,7,8,9,10,11,12,13,14};
        String[] cardSuites = {"\u2660",	"\u2665",	"\u2666",	"\u2663"};

        // needs to loop through the array
        int value = 2;
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < cardSuites.length; j++) {
//                System.out.println(symbols[i] + " " + cardSuites[j]);
                tempCardDeck.add(new Card (cardSuites[j], symbols[i],value));
            }
                value++;
        }
        System.out.println(tempCardDeck);


        }

    public void shuffleCards() {
//            for (int i = 0; i < 52; i++) {
//                int r = i + (int) (Math.random() * (52 - i));
//                Card temp = tempCardDeck.get(r);
//                tempCardDeck.set(r, tempCardDeck.get(i));
//                tempCardDeck.set(i, temp);
            Collections.shuffle(tempCardDeck, new Random());
            System.out.println("Shuffled" + tempCardDeck);
//            System.out.println("\nShuffled List with Random() : \n" + tempCardDeck);
            //https://www.geeksforgeeks.org/shuffle-or-randomize-a-list-in-java/
            }

    
    public Card dealCard() {
        Card topCard = tempCardDeck.get(0);
        System.out.println(topCard);

        return topCard;
    }

    public void sortDeckInNumberOrder() {
//        Arrays.sort(new ArrayList[]{tempCardDeck});
//        Arrays.sort(tempCardDeck, new Comparator<tempCardDeck.getValue>
//                System.out.println(Arrays.asList(tempCardDeck))
        tempCardDeck.sort(Comparator.comparing(Card::getValue));
        System.out.println(tempCardDeck);

    }

    public void sortInSuite() {
        tempCardDeck.sort(Comparator.comparing(Card::getSuit));
        System.out.println(tempCardDeck);
    }
}

