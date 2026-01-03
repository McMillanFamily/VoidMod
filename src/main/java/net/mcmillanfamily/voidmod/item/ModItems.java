package net.mcmillanfamily.voidmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mcmillanfamily.voidmod.VoidMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item VOID_SWORD = registerItem("void_sword",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static ToolItem VOID_PICKAXE = registerItem("void_pickaxe",
            new PickaxeItem(ModToolMaterial.INSTANCE,1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(VoidMod.MOD_ID, name), item);
    }



    public static void registerModItems(){
        VoidMod.LOGGER.debug("Registering Mod items for " + VoidMod.MOD_ID);
    }
}
