package com.eight;

public class Wicket {
	
	private Long over;
	private Long ball;
	private String wicketType;
	private String playerName;
	private String bowlerName;
	
	public Wicket(Long over, Long ball, String wicketType, String playerName, String bowlerName) {
		
		this.over = over;
		this.ball = ball;
		this.wicketType = wicketType;
		this.playerName = playerName;
		this.bowlerName = bowlerName;
		
	}
	
	public Long getOver() {
		return over;
	}

	public void setOver(Long over) {
		this.over = over;
	}

	public Long getBall() {
		return ball;
	}

	public void setBall(Long ball) {
		this.ball = ball;
	}

	public String getWicketType() {
		return wicketType;
	}

	public void setWicketType(String wicketType) {
		this.wicketType = wicketType;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getBowlerName() {
		return bowlerName;
	}

	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}

	public Wicket() {}

}
