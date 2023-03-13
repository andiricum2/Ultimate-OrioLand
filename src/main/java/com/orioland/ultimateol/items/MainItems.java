package com.orioland.ultimateol.items;

import com.orioland.ultimateol.UltimateOrioLand;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.item.Items.PAPER;

public class MainItems implements ModInitializer {

    // objetos
    // EJEMPLO:     public static final Item OBJETO = Registry.register(Registries.ITEM, new Identifier("ultimateol", "OBJETO"), new Item(new FabricItemSettings().maxCount(64)));
    public static final Item ORITA = Registry.register(Registries.ITEM,
            new Identifier("ultimateol", "orita"),
            new Item(new FabricItemSettings().maxCount(64)));

    // https://fabricmc.net/wiki/tutorial:tools
    // public class PICKAXENAME extends PickaxeItem {
    // public PICKAXENAME(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
    //     super(material, attackDamage, attackSpeed, settings);
    // }
}



    public static void registerMainItems() {
        UltimateOrioLand.LOGGER.debug("Registering Mod Items");
    }

    @Override
    public void onInitialize() {
    }
}
