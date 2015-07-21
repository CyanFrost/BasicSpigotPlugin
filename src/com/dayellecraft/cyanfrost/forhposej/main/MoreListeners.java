package com.dayellecraft.cyanfrost.forhposej.main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.entity.EntityShootBowEvent;

public class MoreListeners implements Listener{

	
	@EventHandler public void b(BlockPhysicsEvent event){ //Take physics
		event.setCancelled(true); //And fuck it
	}
	//^as you see, annotations can be on the same line as the method declaration, also you can have multiple annotations

	@EventHandler public void c(EntityShootBowEvent event){ //Check for a shootbowevent
		if(event.getEntity() instanceof Player){ //check what entity shot, check if it is a player
			if(!((Player)event.getEntity()).hasPermission("shootbow")){ //check permissions
				event.setCancelled(true); //cancel it since the player doesn't have permissions
				((Player)event.getEntity()).sendMessage("You are not allowed to shoot arrows"); //send a message telling them so.
			}
		}
	}
	//^Don't do single character method names, name them properly. I do this because I hate everyone.
}
