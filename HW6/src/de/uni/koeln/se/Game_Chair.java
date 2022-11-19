package de.uni.koeln.se;

public class Game_Chair {

	private static Player computer;
	private static Player player_2;
	private static BetMore_Game bet;

	public static void main(String[] args) {

		computer = new Player("Computer");
		computer.user_selected = true;
		computer.x = computer.start();

		player_2 = new Player("Player_2");
		player_2.user_selected = false;
		player_2.x = player_2.start();

		bet = new BetMore_Game();
		if (bet.findWinner(computer, player_2) == null) {
			System.out.println("Unentschieden");
		} else {
			System.out.println("Die Zahl des Computers war: " + computer.x);
			System.out.println(bet.findWinner(computer, player_2).name + " hat das Spiel gewonnen!");
		
		}

	}
}
