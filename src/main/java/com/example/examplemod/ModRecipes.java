package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void addRecipes() {
		GameRegistry.addRecipe(new ItemStack(Items.blaze_powder),
				" a ",
				"aba",
				" a ",
				'a', Blocks.dirt, 'b', Blocks.planks
		);
	}
}
