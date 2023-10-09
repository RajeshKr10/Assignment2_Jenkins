package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.configuration.BeanConfig2;
import com.example.entities.Country;
import com.example.entities.Player;

public class TeamPlayersApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig2.class);
		Player player1 = context.getBean(Player.class);
		player1.setPlayerId("P001");
		player1.setPlayerName("Sachin");
		player1.setCountry(new Country("C001", "INDIA"));
		Player player2 = context.getBean(Player.class);
		player2.setPlayerId("P002");
		player2.setPlayerName("Rohit");
		player2.setCountry(new Country("C001", "INDIA"));
		Player player3 = context.getBean(Player.class);
		player3.setPlayerId("P003");
		player3.setPlayerName("Virat");
		player3.setCountry(new Country("C001", "INDIA"));
		Player player4 = context.getBean(Player.class);
		player4.setPlayerId("P004");
		player4.setPlayerName("R.Ponting");
		player4.setCountry(new Country("C002", "AUSTRALIA"));
		Player player5 = context.getBean(Player.class);
		player5.setPlayerId("P005");
		player5.setPlayerName("B.Lee");
		player5.setCountry(new Country("C002", "AUSTRALIA"));

		System.out.println("Enter a country");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		ArrayList<Player> players = new ArrayList<Player>();
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		players.add(player5);

		Iterator<Player> it = players.iterator();
		while (it.hasNext()) {
			Player player = it.next();
			if (player.getCountry().getCountryName().equalsIgnoreCase(str)) {
				player.show();
			}

		}
		sc.close();
	}

}
