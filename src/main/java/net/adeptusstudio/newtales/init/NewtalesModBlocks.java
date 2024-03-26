
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.adeptusstudio.newtales.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.adeptusstudio.newtales.block.RunicTableBlock;
import net.adeptusstudio.newtales.NewtalesMod;

public class NewtalesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NewtalesMod.MODID);
	public static final RegistryObject<Block> RUNIC_TABLE = REGISTRY.register("runic_table", () -> new RunicTableBlock());
}
