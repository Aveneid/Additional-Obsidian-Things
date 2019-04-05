package aveneid.obsidianadditionalthings.items.armor;

import java.util.List;

import aveneid.obsidianadditionalthings.Main;
import aveneid.obsidianadditionalthings.init.ModItems;
import aveneid.obsidianadditionalthings.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.PotionTypes;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraft.potion.PotionUtils;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.item.ItemArmor.ArmorMaterial;



public class EnchantedArmorBase extends ItemArmor implements IHasModel {
	
	public EnchantedArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		ModItems.ITEMS.add(this);
	}	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
		if (player.getActivePotionEffects().contains(PotionEffectType))
			if(player.inventory.armorItemInSlot(3) != null && 
			   player.inventory.armorItemInSlot(3).getItem() ==  ModItems.ENCHANTED_OBSIDIAN_HELMET) {
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(373),25));
		}
	 
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	/*@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{

		if(repair.getItem().equals(aveneid.obsidianadditionalthings.init.ModItems.OBSIDIAN_INGOT))
			return true;
		else
			return false;
	}*/
}
