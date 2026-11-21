package net.lehraan.fancyaditions.item.custom;

import net.lehraan.fancyaditions.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class GlassJarItem extends Item {
    public GlassJarItem(Properties properties) {
        super(properties);
    }


    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();

        if (!level.isClientSide()) {
            BlockPos placePos = context.getClickedPos()
                    .relative(context.getClickedFace());

            level.setBlock(
                    placePos,
                    ModBlocks.Glass_jar.defaultBlockState(),
                    3
            );

            ItemStack stack = context.getItemInHand();
            stack.shrink(1);
        }

        return InteractionResult.SUCCESS;
    }



    public EquipmentSlot getEquipmentSlot(ItemStack stack) {
        return EquipmentSlot.HEAD;
    }




}
