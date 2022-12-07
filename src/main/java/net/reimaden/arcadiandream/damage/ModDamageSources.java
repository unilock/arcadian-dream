package net.reimaden.arcadiandream.damage;

import net.reimaden.arcadiandream.damage.custom.DanmakuDamageSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import org.jetbrains.annotations.Nullable;

public class ModDamageSources {

    public static DamageSource danmaku(Entity projectile, @Nullable Entity attacker) {
        return new DanmakuDamageSource("danmaku", projectile, attacker).setProjectile();
    }
}
