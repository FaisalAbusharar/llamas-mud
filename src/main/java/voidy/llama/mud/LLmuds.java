package voidy.llama.mud;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class LLmuds implements ModInitializer {

	public static final Item Mud_ball = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static final Item mud_crack = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static final Block Mud_block = new Block(FabricBlockSettings.of(Material.SOIL).strength(0.5F, 0.5F)
			.sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.SHOVELS));

	public static final Block super_mud_block = new Block(FabricBlockSettings.of(Material.SOIL).strength(2.5F, 2.5F)
			.sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.SHOVELS));

	public static final Item dried_mud = new Item(new Item.Settings().group(ItemGroup.FOOD).food(mudfood.dried_mud));

	public static final Item crack = new Item(new Item.Settings().group(ItemGroup.FOOD).food(mudfood.crack));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("llamas", "mud_ball"), Mud_ball);

		Registry.register(Registry.ITEM, new Identifier("llamas", "mud_crack"), mud_crack);

		Registry.register(Registry.BLOCK, new Identifier("llamas", "mud_block"), Mud_block);

		Registry.register(Registry.ITEM, new Identifier("llamas", "mud_block"),

				new BlockItem(Mud_block, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.ITEM, new Identifier("llamas", "dried_mud"), dried_mud);

		Registry.register(Registry.ITEM, new Identifier("llamas", "crack"), crack);

		Registry.register(Registry.BLOCK, new Identifier("llamas", "super_mud_block"), super_mud_block);

		Registry.register(Registry.ITEM, new Identifier("llamas", "super_mud_block"),

				new BlockItem(super_mud_block, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

	}
}
