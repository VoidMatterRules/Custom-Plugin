package io.github.VoidMatterRules.customPlugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class KitCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (sender instanceof Player player) {
            if (player.hasPermission("player.kit")) {
                if (args.length == 0) {

                    Inventory inventory = Bukkit.createInventory(null,9*3,"§6§lKit-Inventory");

                    ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
                    ItemMeta itemMeta = item.getItemMeta();
                    itemMeta.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
                    itemMeta.addEnchant(Enchantment.LOOTING, 6, true);
                    itemMeta.addEnchant(Enchantment.SHARPNESS, 15, true);
                    itemMeta.setDisplayName("§6TestSword");
                    item.setItemMeta(itemMeta);
                    //sets Item, Item name and enchantments

                    inventory.addItem(item); //adds the item to first available slot
                    item.setAmount(86); //makes an 86 stack of the item
                    inventory.setItem(9, item); //puts the item into slot 9 (first slot from the left on the second row, counting starts from 0)

                    player.openInventory(inventory);
                    player.sendMessage("The Kit Menu has been opened.");

                } else {
                    player.sendMessage("Please use /kit!");
                }

            } else {
                player.sendMessage("You don't have permission to use this command!");
            }
        }
        return false;
    }
}
