package net.maketendo.batman_mod.main;

import net.fabricmc.api.ModInitializer;
import net.maketendo.batman_mod.main.core.BatmanModBlockEntities;
import net.maketendo.batman_mod.main.core.BatmanModBlocks;
import net.maketendo.batman_mod.main.core.BatmanModItemGroups;
import net.maketendo.batman_mod.main.core.BatmanModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BatmanMod implements ModInitializer {
    public static final String MOD_ID = "batman";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        BatmanModItemGroups.registerItemGroups();

        BatmanModBlocks.registerModBlocks();
        BatmanModItems.registerModItems();
        BatmanModBlockEntities.registerBlockEntities();
    }
}
