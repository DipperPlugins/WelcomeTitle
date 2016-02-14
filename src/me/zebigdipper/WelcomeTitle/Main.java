package me.zebigdipper.WelcomeTitle;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.zebigdipper.WelcomeTitle.events.PlayerJoin;

public class Main extends JavaPlugin {

	public void onEnable() {
		registerEvents();
		registerConfig();
	}

	public void onDisable() {
		registerConfig();
	}

	public void registerEvents() {

		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new PlayerJoin(this), this);
	}

	private void registerConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();

	}
}