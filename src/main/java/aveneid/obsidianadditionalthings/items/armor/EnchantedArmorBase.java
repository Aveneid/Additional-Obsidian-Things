package aveneid.obsidianadditionalthings.items.armor;

import java.util.List;
import aveneid.obsidianadditionalthings.Main;
import aveneid.obsidianadditionalthings.init.ModItems;
import aveneid.obsidianadditionalthings.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EnchantedArmorBase extends ItemArmor implements IHasModel {
	public EnchantedArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		ModItems.ITEMS.add(this);
	}	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof EnchantedArmorBase
				&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof EnchantedArmorBase
				&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof EnchantedArmorBase
				&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof EnchantedArmorBase) 
			player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 10));
	 
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List<String> dataList, boolean bool) {
		dataList.add("tooltip");
		dataList.add("tooltip2");
    }
	
	//register
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
