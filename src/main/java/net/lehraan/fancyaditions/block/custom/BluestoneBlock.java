package net.lehraan.fancyaditions.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.dedicated.Settings;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import javax.swing.text.html.BlockView;

public class BluestoneBlock extends Block {

    public BluestoneBlock(Properties properties) {
        super(properties);
    }

    // Tells Minecraft that this block is a redstone power source
    @Override
    protected boolean isSignalSource(BlockState state) {
        return true;
    }

    // Defines weak power output (powers adjacent redstone dust and components)
    @Override
    protected int getSignal(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        // Vanilla redstone maxes out at 15
        return 15;
    }

    // Defines strong power output (strongly powers solid blocks next to this block)
    @Override
    protected int getDirectSignal(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return getSignal(state, level, pos, direction);
    }
}
