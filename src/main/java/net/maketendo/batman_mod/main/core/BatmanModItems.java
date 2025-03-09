package net.maketendo.batman_mod.main.core;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maketendo.batman_mod.main.BatmanMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BatmanModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BatmanMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BatmanMod.LOGGER.info("Registering Mod Items for " + BatmanMod.MOD_ID);


    }
}
