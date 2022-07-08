
package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeckOfCards {

	static Scanner sc = new Scanner(System.in);
	static List<Player> playerList = new ArrayList<Player>();

	String[] suit = { "Diamond", "Heart", "Spade", "Club" };
	String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	String[][] cardSet = new String[4][13];

	public void assignCard() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cardSet[i][j] = suit[i] + rank[j];
			}
		}
	}

	public void addPlayer(int numberOfPlayers) {
		System.out.println("Player Details");
		if (numberOfPlayers <= 4 && numberOfPlayers > 2) {

			for (int i = 0; i < numberOfPlayers; i++) {
				System.out.print("Player Name :");
				String name = sc.next();
				Player player = new Player(name);
				playerList.add(player);

				for (int j = 0; j < playerList.size(); j++) {
					System.out.println(playerList.get(j));
				}
			}
			System.out.println("The Size of the Player list is :" + playerList.size());
		} else {
			System.out.println("Player size should be <=4 and >2 ");
		}

	}

	public void playerOrder(int numberOfPlayers) {
        System.out.println("Enter Player Order");
        for (int i=0; i<numberOfPlayers; i++){
            System.out.println("Player Order " +(i+1));
            int turn = sc.nextInt();

        }
    }
