package io.github.VoidMatterRules.customPlugin.Main;

import org.bukkit.plugin.java.JavaPlugin;

public final class CustomPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Custom Plugin Enabled");

    }

    @Override
    public void onDisable() {
        System.out.println("Custom Plugin Shutdown");
    }
}

