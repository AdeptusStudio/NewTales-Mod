
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.adeptusstudio.newtales.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.adeptusstudio.newtales.item.FairedSwordItem;
import net.adeptusstudio.newtales.NewtalesMod;

public class NewtalesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NewtalesMod.MODID);
	public static final RegistryObject<Item> FAIRED_SWORD = REGISTRY.register("faired_sword", () -> new FairedSwordItem());
	public static final RegistryObject<Item> RUNIC_TABLE = block(NewtalesModBlocks.RUNIC_TABLE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
