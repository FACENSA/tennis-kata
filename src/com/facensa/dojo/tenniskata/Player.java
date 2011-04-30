package com.facensa.dojo.tenniskata;

public class Player {

	private String _name;
	private String[] _score = {"0", "15", "30", "40"};
	private int _scoreIndex;
	public String getScore(){
		return _score[_scoreIndex];
		
	}
	
	public Player(String name) {
		_name = name;
		_scoreIndex = 0;
		
	}
	
	public String getName() {
		return _name;
	}

	public void point() {
		_scoreIndex++;
	}

}
