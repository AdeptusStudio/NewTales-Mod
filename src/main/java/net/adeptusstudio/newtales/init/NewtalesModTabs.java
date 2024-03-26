
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.adeptusstudio.newtales.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.adeptusstudio.newtales.NewtalesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewtalesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewtalesMod.MODID);
	public static final RegistryObject<CreativeModeTab> NEWTALES_MISC = REGISTRY.register("newtales_misc",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.newtales.newtales_misc")).icon(() -> new ItemStack(NewtalesModBlocks.RUNIC_TABLE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NewtalesModBlocks.RUNIC_TABLE.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(NewtalesModItems.FAIRED_SWORD.get());
		}
	}
}
