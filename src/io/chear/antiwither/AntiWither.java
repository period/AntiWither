package io.chear.antiwither;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiWither extends JavaPlugin {
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new SpawnListener(), this);
	}
	@Override
	public void onDisable() {
		
	}
}
