package net.lehraan.fancyaditions.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GlassJarBlock extends Block {
    public GlassJarBlock(Properties properties) {
        super(properties);
    }





    public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }

    public static final VoxelShape SHAPE = Block.box(5, 0, 5, 11, 7, 11);
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
}
