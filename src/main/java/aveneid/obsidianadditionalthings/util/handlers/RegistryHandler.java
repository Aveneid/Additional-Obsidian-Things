package aveneid.obsidianadditionalthings.util.handlers;

import aveneid.obsidianadditionalthings.init.ModBlocks;
import aveneid.obsidianadditionalthings.init.ModItems;
import aveneid.obsidianadditionalthings.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public static void OnItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	@SubscribeEvent
	public static void OnBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	
	@SubscribeEvent
	public static void OnModelRegister(ModelRegistryEvent event) {
		for(Item item: ModItems.ITEMS)
			if(item instanceof IHasModel)
				((IHasModel)item).registerModels();
		
	
	for(Block block: ModBlocks.BLOCKS) 
		if(block instanceof IHasModel)
			((IHasModel)block).registerModels();
	
}
	
}
