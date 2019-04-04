package aveneid.obsidianadditionalthings.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import aveneid.obsidianadditionalthings.items.ItemBase;
import aveneid.obsidianadditionalthings.items.tools.ToolAxe;
import aveneid.obsidianadditionalthings.items.tools.ToolSpade;
import aveneid.obsidianadditionalthings.items.tools.ToolSword;



public class ModItems {
// 0 - materials, 1 - tools, 2 - armor, 3 - combat
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot",0);
	
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("MATERIAL_OBSIDIAN", 2, 2500, 8.0f, 2.0f, 10);
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN);
	public static final ItemSpade OBSIDIAN_SPADE = new ToolSpade("obsidian_spade", MATERIAL_OBSIDIAN);
	/*public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe",MATERIAL_OBSIDIAN);
	
	/*
	public static final Item OBSIDIAN_HELMET = new ItemBase("obsidian_helmet",2);
	public static final Item OBSIDIAN_CHESTPLATE = new ItemBase("obsidian_chestplate",2);
	public static final Item OBSIDIAN_BOOTS = new ItemBase("obsidian_boots",2);
	public static final Item OBSIDIAN_LEGGINS = new ItemBase("obsidian_leggins",2);
	*/
	
	
}
