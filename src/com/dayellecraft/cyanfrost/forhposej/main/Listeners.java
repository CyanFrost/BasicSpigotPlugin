package com.dayellecraft.cyanfrost.forhposej.main;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Listeners implements Listener{ //Implement Listener because that is what we'll need

	@EventHandler  //This annotation is important for listeners
	public void canNameThisAnything(PlayerJoinEvent event){ //The parameters for this listener are what are parsed, so when the event that maches the paremeters is called, it looks for this method
		if(!event.getPlayer().hasPlayedBefore()){ //check if the player has joined before.
			Bukkit.broadcastMessage("This is " + event.getPlayer().getName() +"'s First Time Playing!!! :D"); //broadcast a message to the server
		}
	}
	
}
