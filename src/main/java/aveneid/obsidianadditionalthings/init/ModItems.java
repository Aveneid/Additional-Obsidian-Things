package aveneid.obsidianadditionalthings.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import aveneid.obsidianadditionalthings.items.ItemBase;
import aveneid.obsidianadditionalthings.items.armor.ArmorBase;
import aveneid.obsidianadditionalthings.items.armor.EnchantedArmorBase;
import aveneid.obsidianadditionalthings.items.tools.ToolAxe;
import aveneid.obsidianadditionalthings.items.tools.ToolHoe;
import aveneid.obsidianadditionalthings.items.tools.ToolPickaxe;
import aveneid.obsidianadditionalthings.items.tools.ToolSpade;
import aveneid.obsidianadditionalthings.items.tools.ToolSword;
import aveneid.obsidianadditionalthings.util.Reference;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;


public class ModItems {
// 0 - materials, 1 - tools, 2 - armor, 3 - combat
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot",0);
	
	
	//Materials
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("MATERIAL_OBSIDIAN", 2, 2500, 8.0f, 3.5f, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_OBSIDIAN = EnumHelper.addArmorMaterial("ARMOR_MATERIAL_OBSIDIAN", Reference.MOD_ID + ":obsidian", 14, new int[]{2, 5, 4, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
	public static final ArmorMaterial ENCHANTED_ARMOR_MATERIAL_OBSIDIAN = EnumHelper.addArmorMaterial("ENCHANTED_ARMOR_MATERIAL_OBSIDIAN", Reference.MOD_ID + ":obsidian", 14, new int[]{3, 6, 5, 3}, 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
	//public static final ArmorMaterial ENCHANTED_ARMOR_MATERIAL_OBSIDIAN = EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness)terial("ENCHANTED_ARMOR_MATERIAL_OBSIDIAN", Reference.MOD_ID + ":obsidian", 14, new int[]{3, 6, 5, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);

	//Tools
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN);
	public static final ItemSpade OBSIDIAN_SPADE = new ToolSpade("obsidian_spade", MATERIAL_OBSIDIAN);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe",MATERIAL_OBSIDIAN);
	
	
	//Armor
	public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
	public static final Item OBSIDIAN_CHESTPLATE = new ArmorBase("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.CHEST );
	public static final Item OBSIDIAN_LEGGINS = new ArmorBase("obsidian_leggins", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.LEGS );
	public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots",ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.FEET );
	
	
	public static final Item ENCHANTED_OBSIDIAN_HELMET = new EnchantedArmorBase("enchanted_obsidian_helmet", ENCHANTED_ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENCHANTED_OBSIDIAN_CHESTPLATE = new EnchantedArmorBase("enchanted_obsidian_chestplate", ENCHANTED_ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.CHEST );
	public static final Item ENCHANTED_OBSIDIAN_LEGGINS = new EnchantedArmorBase("enchanted_obsidian_leggins", ENCHANTED_ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.LEGS );
	public static final Item ENCHANTED_OBSIDIAN_BOOTS = new EnchantedArmorBase("enchanted_obsidian_boots",ENCHANTED_ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.FEET );
	
}
