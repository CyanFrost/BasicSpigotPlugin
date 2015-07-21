package com.dayellecraft.cyanfrost.forhposej.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public void onEnable(){ //Called when the plugin is enabled.
		Bukkit.getPluginManager().registerEvents(new Listeners(), this); //Register Listener in the PluginManager
	}
	
	public void onDisable(){ //Called when the plugin is disabled.
		
	}
	
	public void onLoad(){ //Called when the plugin is loaded. Don't do any API Calls here.
		
	}
}
