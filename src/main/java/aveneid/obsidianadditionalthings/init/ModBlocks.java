package aveneid.obsidianadditionalthings.init;

import java.util.ArrayList;
import java.util.List;
import aveneid.obsidianadditionalthings.blocks.PackedObsidianBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block PACKED_OBSIDIAN_BLOCK = new PackedObsidianBlock("packed_obsidian_block", Material.ROCK);
}
