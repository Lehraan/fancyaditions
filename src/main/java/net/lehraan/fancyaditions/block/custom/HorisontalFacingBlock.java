package net.lehraan.fancyaditions.block.custom;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class HorisontalFacingBlock extends HorizontalDirectionalBlock {
    // Gjenbruker standard retningsegenskap fra Minecraft
    public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

    public HorisontalFacingBlock(BlockBehaviour.Properties properties) {
        super(properties);
        // Setter standard retning til Nord når blokken lages
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    // Bestemmer hvilken vei blokken skal peke når spilleren plasserer den
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    // Forteller Minecraft at denne blokken har en FACING-egenskap
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
