package aveneid.obsidianadditionalthings.init;

import java.util.ArrayList;
import java.util.List;

import aveneid.obsidianadditionalthings.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems {
// 0 - materials, 1 - tools, 2 - armor, 3 - combat
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot",0);
	public static final Item OBSIDIAN_PICKAXE = new ItemBase("obsidian_pickaxe",1);
	public static final Item OBSIDIAN_AXE = new ItemBase("obsidian_axe",1);
	public static final Item OBSIDIAN_SHOVEL = new ItemBase("obsidian_shovel",1);
	public static final Item OBSIDIAN_SWORD = new ItemBase("obsidian_sword",2);
	public static final Item OBSIDIAN_HOE = new ItemBase("obsidian_hoe",1);
	public static final Item OBSIDIAN_HELMET = new ItemBase("obsidian_helmet",2);
	public static final Item OBSIDIAN_CHESTPLATE = new ItemBase("obsidian_chestplate",2);
	public static final Item OBSIDIAN_BOOTS = new ItemBase("obsidian_boots",2);
	public static final Item OBSIDIAN_LEGGINS = new ItemBase("obsidian_leggins",2);
}
