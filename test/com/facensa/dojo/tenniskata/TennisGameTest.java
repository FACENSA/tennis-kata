package com.facensa.dojo.tenniskata;


import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {

	private TennisGame game;
	
	@Before
	public void setUp() throws Exception {
		game = new TennisGame("Nadal","Federer");
	}

	@After
	public void tearDown() throws Exception {
		game = null;
	}
	
	@Test
	public void shouldHaveTwoPlayers()
	{
		Assert.assertEquals(2, game.getPlayers().size());
	}
	
	@Test
	public void shouldReturnLoveOnMacthBegin(){
		String score = game.checkScore();
		Assert.assertEquals("0x0", score);
	}
	
	@Test
	public void shouldReturnScore15x0AfterNadalPoint(){
		game.doPoint(game.getPlayer1());
		Assert.assertEquals("15x0", game.checkScore());
	}
    @Test
    public void firstPlayerMustBeNamedNadal(){
    	Assert.assertEquals("Nadal", game.getPlayer1().getName());
    }
    
    @Test
    public void secondPlayerMustBeNamedNadal(){
    	Assert.assertEquals("Federer", game.getPlayer2().getName());
    }
    
    @Test
	public void shouldReturnScore15x15(){
		game.doPoint(game.getPlayer1());
		game.doPoint(game.getPlayer2());
		Assert.assertEquals("15x15", game.checkScore());
	}

    @Test
	public void shouldReturnScore30x15(){
		game.doPoint(game.getPlayer1());
		game.doPoint(game.getPlayer2());
		game.doPoint(game.getPlayer1());
		Assert.assertEquals("30x15", game.checkScore());
	}
    
    @Test
	public void shouldReturnScoreAdvx40(){
		game.doPoint(game.getPlayer2());
		game.doPoint(game.getPlayer1());
		game.doPoint(game.getPlayer2());
		game.doPoint(game.getPlayer1());
		game.doPoint(game.getPlayer2());
		game.doPoint(game.getPlayer1());
		game.doPoint(game.getPlayer1());
		Assert.assertEquals("Advx40", game.checkScore());
		// TODO construir vantagem
	}
}

