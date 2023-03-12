package com.orioland.ultimateol.itemgroups;

import com.orioland.ultimateol.items.MainItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.orioland.ultimateol.UltimateOrioLand;


public class ultimateorioland {
    private static final ItemGroup UltimateOrioland = FabricItemGroup.builder(new Identifier("ultimateol", "ultimateorioland"))
            .displayName(Text.literal("Ultimate OrioLand"))
            .icon(() -> new ItemStack(MainItems.ORITA))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(MainItems.ORITA);
            })
            .build();

    public static void registerUltimateOrioLand() {
        UltimateOrioLand.LOGGER.debug("Registering Mod Items");
    }

}