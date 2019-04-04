package aveneid.obsidianadditionalthings.items;

import aveneid.obsidianadditionalthings.init.ModItems;
import aveneid.obsidianadditionalthings.util.IHasModel;

import aveneid.obsidianadditionalthings.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	// 0 - materials, 1 - tools,2 - combat
	public ItemBase(String name, int mode) {
		setUnlocalizedName(name);
		setRegistryName(name);
		if(mode == 0) setCreativeTab(CreativeTabs.MATERIALS);
		//if(mode == 1) setCreativeTab(CreativeTabs.TOOLS);
		//if(mode == 2) setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	

}
