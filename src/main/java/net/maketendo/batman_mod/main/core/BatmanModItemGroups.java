package net.maketendo.batman_mod.main.core;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maketendo.batman_mod.main.BatmanMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BatmanModItemGroups {
    public static final ItemGroup MAIN = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BatmanMod.MOD_ID, "main"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.FEATHER))
                    .displayName(Text.translatable("itemgroup.batmanmod.main"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.ACACIA_FENCE);
                    }).build());



    public static void registerItemGroups() {
        BatmanMod.LOGGER.info("Registering Item Groups for " + BatmanMod.MOD_ID);
    }
}