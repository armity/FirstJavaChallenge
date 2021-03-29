package com.nology;

import java.util.Scanner;

public class Snap extends CardGame {

    public Snap(String name) {
        super(name);

    }

    public void play() {


        Card firstCard = dealCard();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter to take your turn: ");
        String newTurn = scanner.nextLine();
        System.out.print(newTurn);


        shuffleCards();
        Card newCard = dealCard();

//        while (firstCard.getSymbol() != newCard.getSymbol()) {
        if (newCard.getSymbol().equals(firstCard.getSymbol())) {
                System.out.println("You Win");
            } else {
                System.out.println("Try Again");
                play();
            }

//        }
        }



        // By pressing enter in the command line, the user takes their turn.
        // Each turn, a new card is dealt from the deck.
        // The game continues until two cards in a row have the same symbol,
        // at which point the “player” wins and the game ends.
    }
