package io.github.VoidMatterRules.customPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HealCommand implements CommandExecutor {

    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (sender instanceof Player player) {
            player.setHealth(20);
            player.setFoodLevel(20);
            player.sendMessage("§aYou got healed!");
        }
            else
                sender .sendMessage("You must be a player to use this command");

        return false;

    }
}
