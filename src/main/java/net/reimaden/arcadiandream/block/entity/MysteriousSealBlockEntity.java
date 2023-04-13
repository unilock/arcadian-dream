package net.reimaden.arcadiandream.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class MysteriousSealBlockEntity extends BlockEntity {

    public static final int RANGE = 16;

    public MysteriousSealBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MYSTERIOUS_SEAL, pos, state);
    }

    @SuppressWarnings("unused")
    public static void tick(World world, BlockPos pos, BlockState state, MysteriousSealBlockEntity blockEntity) {
        if (world.getTime() % 40L == 0L) {
            applyEffect(world, pos);
        }
    }

    private static void applyEffect(World world, BlockPos pos) {
        if (world.isClient()) return;

        Box box = new Box(pos).expand(RANGE);
        List<PlayerEntity> list = world.getEntitiesByClass(PlayerEntity.class, box, EntityPredicates.EXCEPT_CREATIVE_OR_SPECTATOR);

        for (PlayerEntity player : list) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 200, 2, true, true));
        }
    }
}