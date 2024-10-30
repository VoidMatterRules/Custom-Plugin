package io.github.VoidMatterRules.customPlugin;

import io.github.VoidMatterRules.customPlugin.commands.HealCommand;
import io.github.VoidMatterRules.customPlugin.commands.KitCommand;
import io.github.VoidMatterRules.customPlugin.listeners.JoinListener;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static void main(String[] args) {}

    @Override
    public void onEnable() {
        PluginCommand healCommand = getCommand("HealTestCommand");
        PluginCommand kitCommand = getCommand("KitTestCommand");
        if (healCommand != null) {
            healCommand.setExecutor(new HealCommand());
            System.out.println("Command has been found.");
        } else {
            getLogger().severe("No command found!");
        }
        if (kitCommand != null) {
            kitCommand.setExecutor(new KitCommand());
            System.out.println("Command has been found.");
        } else {
            getLogger().severe("No command found!");
        }
        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new JoinListener(), this);
    }
}