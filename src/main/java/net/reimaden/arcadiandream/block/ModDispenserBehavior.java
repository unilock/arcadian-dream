/*
 * Copyright (c) 2022-2023 Maxmani and contributors.
 * Licensed under the EUPL-1.2 or later.
 */

package net.reimaden.arcadiandream.block;

import net.minecraft.block.DispenserBlock;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Util;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;
import net.reimaden.arcadiandream.entity.custom.danmaku.*;
import net.reimaden.arcadiandream.item.ModItems;

public class ModDispenserBehavior {

    public static void register() {
        DispenserBlock.registerBehavior(ModItems.CIRCLE_SHOT, new DanmakuDispenserBehavior() {

            @Override
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
                return Util.make(new CircleBulletEntity(world, position.getX(), position.getY(), position.getZ()), entity -> entity.setItem(stack));
            }
        });
        DispenserBlock.registerBehavior(ModItems.BUBBLE_SHOT, new DanmakuDispenserBehavior() {

            @Override
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
                return Util.make(new BubbleBulletEntity(world, position.getX(), position.getY(), position.getZ()), entity -> entity.setItem(stack));
            }
        });
        DispenserBlock.registerBehavior(ModItems.AMULET_SHOT, new DanmakuDispenserBehavior() {

            @Override
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
                return Util.make(new AmuletBulletEntity(world, position.getX(), position.getY(), position.getZ()), entity -> entity.setItem(stack));
            }
        });
        DispenserBlock.registerBehavior(ModItems.STAR_SHOT, new DanmakuDispenserBehavior() {

            @Override
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
                return Util.make(new StarBulletEntity(world, position.getX(), position.getY(), position.getZ()), entity -> entity.setItem(stack));
            }
        });
        DispenserBlock.registerBehavior(ModItems.KUNAI_SHOT, new DanmakuDispenserBehavior() {

            @Override
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
                return Util.make(new KunaiBulletEntity(world, position.getX(), position.getY(), position.getZ()), entity -> entity.setItem(stack));
            }
        });
    }
}
