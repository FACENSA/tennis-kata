package com.facensa.dojo.tenniskata;

import java.util.ArrayList;
import java.util.List;

public class TennisGame {

	private List<Player> players;

	public TennisGame(String player1, String player2) {
		players = new ArrayList<Player>();
	    players.add(new Player(player1));
	    players.add(new Player(player2));
	}

	public List<Player> getPlayers() {
		return players;
	}

	public String checkScore() {
		return getPlayer1().getScore() + "x" + getPlayer2().getScore();
	}

	public void doPoint(Player player) {
		player.point();
	}

	public Player getPlayer1() {
		return players.get(0);
	}

	public Player getPlayer2() {
		return players.get(1);
	}

}
