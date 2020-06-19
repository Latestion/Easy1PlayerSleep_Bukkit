package me.Latestion.onePS;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		// Does when the plugin Starts
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		// Does when the plugin disables
	}
	
	@EventHandler
	public void onSleep(PlayerBedEnterEvent event) { 
		Player player = (Player) event.getPlayer();
		World world = player.getWorld();
		world.setStorm(false);
		world.setThundering(false);
		if (world.getTime() >= 12542) {
			if (!(player instanceof Player)) {
				
			}
			
			else {
				String player1 = event.getPlayer().getDisplayName();
				for (Player p : world.getPlayers())
				{
				      p.sendMessage(ChatColor.WHITE + "" + ChatColor.BOLD + player1 + " Went To Sleep");
				      
				}
				
				world.setFullTime(0);
				
			}
		}

	}
	
}
