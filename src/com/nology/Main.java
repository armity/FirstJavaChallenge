package com.nology;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        CardGame testGame = new CardGame("Armity's game");
//        testGame.getDeck();
//
//        testGame.shuffleCards();
//
//        testGame.dealCard();
//
//        testGame.sortDeckInNumberOrder();
//
//        testGame.sortInSuite();

        Snap newGame = new Snap("Friday Snap");
//        System.out.println(newGame);
        newGame.getDeck();

        newGame.play();




    }
}
