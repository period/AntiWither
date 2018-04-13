package io.chear.antiwither;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class SpawnListener implements Listener {
	@EventHandler
	public void onEntitySpawn(EntitySpawnEvent e) {
		if(e.getEntityType() == EntityType.WITHER || e.getEntityType() == EntityType.WITHER_SKULL) {
			Bukkit.getLogger().log(Level.INFO, "Prevented Wither spawn at " + e.getEntity().getLocation());
			e.setCancelled(true);
		}
	}
}
