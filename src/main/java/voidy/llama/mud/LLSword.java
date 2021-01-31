package voidy.llama.mud;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class LLSword implements ToolMaterial {

    public static final LLTools INSTANCE = new LLTools();

    @Override
    public int getDurability() {

        return 200;
    }

    @Override
    public float getMiningSpeedMultiplier() {

        return 3;
    }

    @Override
    public float getAttackDamage() {

        return 4;
    }

    @Override
    public int getMiningLevel() {

        return 2;
    }

    @Override
    public int getEnchantability() {

        return 17;
    }

    @Override
    public Ingredient getRepairIngredient() {

        return Ingredient.ofItems(LLmuds.super_mud_block);

    }

}