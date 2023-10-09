package com.example.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Player {
	private String playerId;
	private String playerName;
	@Autowired
	private Country country;

	public Player() {

	}

	public Player(String playerId, String playerName) {
		this.playerId = playerId;
		this.playerName = playerName;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void show() {
		System.out.println("Player ID: " + playerId);
		System.out.println("Player Name: " + playerName);
		System.out.println("Country: " + country.toString());
		System.out.println();
	}
}
