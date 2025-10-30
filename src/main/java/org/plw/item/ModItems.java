package org.plw.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.plw.D20A;

public class ModItems {
    public static final Item COPPER_COIN = registerItem("copper_coin", new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(D20A.MOD_ID, name), item);
    }
    public static void registerModItems(){
        D20A.LOGGER.info("Registering mod items for: "+D20A.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(COPPER_COIN);
        });
    }
}
