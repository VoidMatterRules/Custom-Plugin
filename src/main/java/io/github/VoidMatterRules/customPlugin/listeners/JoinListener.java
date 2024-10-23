package io.github.VoidMatterRules.customPlugin.listeners;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        event.setJoinMessage("§6HAHA YOU'RE ACTUALLY DUMB ENOUGH TO JOIN THIS SHIT!!!");
    }
}
