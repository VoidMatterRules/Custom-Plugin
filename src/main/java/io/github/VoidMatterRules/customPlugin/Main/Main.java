package io.github.VoidMatterRules.customPlugin.Main;

import io.github.VoidMatterRules.customPlugin.commands.HealCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("HealTestCommand").setExecutor(new HealCommand());
    }
}