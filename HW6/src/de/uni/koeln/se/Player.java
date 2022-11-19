package de.uni.koeln.se;

import java.util.Scanner;

public class Player {

	public int x;
	public String name;
	public boolean user_selected;

	private BetMore_Game bet;

	private int a;

	public Player(String name) {
		this.name = name;
	}

	public int start() {
		bet = new BetMore_Game();
		int i = 0;

		if (user_selected == false) {
			while (i < 5) {
				i++;

				x = bet.play();
				System.out.println("Die Zahl lautet: " + x);
				if (i < 5) {

					Scanner in = new Scanner(System.in);
					System.out.println("Karte behalten = 1 oder Neue Karte = 0");

					a = in.nextInt();
				}

				if (a == 0) {
					user_selected = false;
				} else {
					user_selected = true;
					break;
				}

			}
		} else {
			x = bet.play();
			// System.out.println("Die Computer Zahl lautet: " + x);
		}

		// System.out.println("Die endgültige Zahl lautet: " + x);
		return x;
	}

}
