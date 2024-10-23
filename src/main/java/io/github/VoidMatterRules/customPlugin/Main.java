package io.github.VoidMatterRules.customPlugin;

import io.github.VoidMatterRules.customPlugin.commands.HealCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("HealTestCommand")).setExecutor(new HealCommand());
    }
}