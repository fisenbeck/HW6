package de.uni.koeln.se;

public class BetMore_Game {

	private Shuffle s;

	public int play() {

		s = new Shuffle();
		int x = s.pick_card();
		return x;
	}

	public Player findWinner(Player computer, Player player_2) {
		if (computer.x > player_2.x) {			
			return computer;
		} else if(computer.x == player_2.x) {
			return null;
		}
		else {			
			return player_2;
		}
	}

}
