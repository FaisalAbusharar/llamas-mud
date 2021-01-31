package voidy.llama.mud;

import net.minecraft.item.PickaxeItem;

import net.minecraft.item.ToolMaterial;

public class CustomPickaxe extends PickaxeItem {

    public CustomPickaxe(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, (int) attackDamage, attackSpeed, settings);

    }

}