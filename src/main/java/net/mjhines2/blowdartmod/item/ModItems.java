package net.mjhines2.blowdartmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mjhines2.blowdartmod.BlowDartMod;

public class ModItems {

    public static final Item FROG_TOXIN = registerItem("frog_toxin",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BlowDartMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BlowDartMod.LOGGER.debug("Registering Mod Items for " + BlowDartMod.MOD_ID);
    }
}
