package cz.lsrom.superflat.biomes;

import carpet.api.settings.Rule;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.Arrays;
import java.util.List;

public class SuperFlatBiomesSettings {

    public static final String GENERATION = "generation";

    @Rule(categories = GENERATION)
    public static boolean generateFeatures = false;

    @Rule(categories = GENERATION)
    public static boolean generateAllStructures = false;

    @Rule(categories = GENERATION)
    public static boolean generateVillages = false;

    @Rule(categories = GENERATION)
    public static boolean generateStrongholds = false;

    public static List<Block> worldBlocks = Arrays.asList(Blocks.BEDROCK, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.DIRT, Blocks.GRASS_BLOCK);
}
