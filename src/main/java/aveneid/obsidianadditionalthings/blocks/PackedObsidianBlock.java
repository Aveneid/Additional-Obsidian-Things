package aveneid.obsidianadditionalthings.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PackedObsidianBlock extends BlockBase {

	public PackedObsidianBlock(String name, Material material) {
		
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(75.0F);
		setResistance(9000.0F);
		setHarvestLevel("pickaxe",3);
		setLightLevel(0.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}	
}
