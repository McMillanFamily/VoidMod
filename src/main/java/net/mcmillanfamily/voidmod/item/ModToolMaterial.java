package net.mcmillanfamily.voidmod.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ModToolMaterial implements ToolMaterial {
    // Define an instance to reference later
    public static final ModToolMaterial INSTANCE = new ModToolMaterial();

    @Override
    public int getDurability() {
        return 500; // Example durability
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0F; // Example mining speed (vanilla iron is 6.0F)
    }

    @Override
    public float getAttackDamage() {
        return 2.5F; // Example attack damage
    }

    @Override
    public int getMiningLevel() {
        return 2; // Example mining level (iron level)
    }

    @Override
    public int getEnchantability() {
        return 15; // Example enchantability
    }

    @Override
    public Ingredient getRepairIngredient() {
        // Specify the item used to repair the tool in an anvil
        return Ingredient.ofItems(ModItems.VOID_PICKAXE);
    }
}
