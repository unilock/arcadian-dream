package net.reimaden.arcadiandream.config;

import blue.endless.jankson.Jankson;
import io.wispforest.owo.config.ConfigWrapper;
import io.wispforest.owo.config.Option;
import io.wispforest.owo.util.Observable;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ArcadianDreamConfig extends ConfigWrapper<net.reimaden.arcadiandream.config.ModConfigModel> {

    private final Option<java.lang.Boolean> chiselOptions_canUse = this.optionForKey(new Option.Key("chiselOptions.canUse"));
    private final Option<java.lang.Integer> chiselOptions_maxDistance = this.optionForKey(new Option.Key("chiselOptions.maxDistance"));
    private final Option<java.lang.Boolean> nueTridentOptions_canHaveImpaling = this.optionForKey(new Option.Key("nueTridentOptions.canHaveImpaling"));
    private final Option<java.lang.Integer> hisouSwordOptions_minHeightForPeaches = this.optionForKey(new Option.Key("hisouSwordOptions.minHeightForPeaches"));
    private final Option<java.lang.Boolean> hisouSwordOptions_canDisableShields = this.optionForKey(new Option.Key("hisouSwordOptions.canDisableShields"));
    private final Option<java.lang.Boolean> mochiMalletOptions_lowViolence = this.optionForKey(new Option.Key("mochiMalletOptions.lowViolence"));
    private final Option<java.lang.Boolean> houraiElixirOptions_canDrink = this.optionForKey(new Option.Key("houraiElixirOptions.canDrink"));
    private final Option<java.lang.Integer> danmakuCooldownMultiplier = this.optionForKey(new Option.Key("danmakuCooldownMultiplier"));
    private final Option<java.lang.Integer> danmakuDamageMultiplier = this.optionForKey(new Option.Key("danmakuDamageMultiplier"));
    private final Option<java.lang.Boolean> cooldownPerBulletType = this.optionForKey(new Option.Key("cooldownPerBulletType"));
    private final Option<java.lang.Boolean> fairyOptions_spawnFairies = this.optionForKey(new Option.Key("fairyOptions.spawnFairies"));
    private final Option<java.lang.Boolean> fairyOptions_spawnSunflowerFairies = this.optionForKey(new Option.Key("fairyOptions.spawnSunflowerFairies"));

    private ArcadianDreamConfig() {
        super(net.reimaden.arcadiandream.config.ModConfigModel.class);
    }

    private ArcadianDreamConfig(Consumer<Jankson.Builder> janksonBuilder) {
        super(net.reimaden.arcadiandream.config.ModConfigModel.class, janksonBuilder);
    }

    public static ArcadianDreamConfig createAndLoad() {
        var wrapper = new ArcadianDreamConfig();
        wrapper.load();
        return wrapper;
    }

    public static ArcadianDreamConfig createAndLoad(Consumer<Jankson.Builder> janksonBuilder) {
        var wrapper = new ArcadianDreamConfig(janksonBuilder);
        wrapper.load();
        return wrapper;
    }

    public final ChiselOptions_ chiselOptions = new ChiselOptions_();
    public class ChiselOptions_ implements ChiselOptions {
        public boolean canUse() {
            return chiselOptions_canUse.value();
        }

        public void canUse(boolean value) {
            chiselOptions_canUse.set(value);
        }

        public int maxDistance() {
            return chiselOptions_maxDistance.value();
        }

        public void maxDistance(int value) {
            chiselOptions_maxDistance.set(value);
        }

    }
    public final NueTridentOptions_ nueTridentOptions = new NueTridentOptions_();
    public class NueTridentOptions_ implements NueTridentOptions {
        public boolean canHaveImpaling() {
            return nueTridentOptions_canHaveImpaling.value();
        }

        public void canHaveImpaling(boolean value) {
            nueTridentOptions_canHaveImpaling.set(value);
        }

    }
    public final HisouSwordOptions_ hisouSwordOptions = new HisouSwordOptions_();
    public class HisouSwordOptions_ implements HisouSwordOptions {
        public int minHeightForPeaches() {
            return hisouSwordOptions_minHeightForPeaches.value();
        }

        public void minHeightForPeaches(int value) {
            hisouSwordOptions_minHeightForPeaches.set(value);
        }

        public boolean canDisableShields() {
            return hisouSwordOptions_canDisableShields.value();
        }

        public void canDisableShields(boolean value) {
            hisouSwordOptions_canDisableShields.set(value);
        }

    }
    public final MochiMalletOptions_ mochiMalletOptions = new MochiMalletOptions_();
    public class MochiMalletOptions_ implements MochiMalletOptions {
        public boolean lowViolence() {
            return mochiMalletOptions_lowViolence.value();
        }

        public void lowViolence(boolean value) {
            mochiMalletOptions_lowViolence.set(value);
        }

    }
    public final HouraiElixirOptions_ houraiElixirOptions = new HouraiElixirOptions_();
    public class HouraiElixirOptions_ implements HouraiElixirOptions {
        public boolean canDrink() {
            return houraiElixirOptions_canDrink.value();
        }

        public void canDrink(boolean value) {
            houraiElixirOptions_canDrink.set(value);
        }

    }
    public int danmakuCooldownMultiplier() {
        return danmakuCooldownMultiplier.value();
    }

    public void danmakuCooldownMultiplier(int value) {
        danmakuCooldownMultiplier.set(value);
    }

    public int danmakuDamageMultiplier() {
        return danmakuDamageMultiplier.value();
    }

    public void danmakuDamageMultiplier(int value) {
        danmakuDamageMultiplier.set(value);
    }

    public boolean cooldownPerBulletType() {
        return cooldownPerBulletType.value();
    }

    public void cooldownPerBulletType(boolean value) {
        cooldownPerBulletType.set(value);
    }

    public final FairyOptions fairyOptions = new FairyOptions();
    public class FairyOptions implements fairyOptions {
        public boolean spawnFairies() {
            return fairyOptions_spawnFairies.value();
        }

        public void spawnFairies(boolean value) {
            fairyOptions_spawnFairies.set(value);
        }

        public boolean spawnSunflowerFairies() {
            return fairyOptions_spawnSunflowerFairies.value();
        }

        public void spawnSunflowerFairies(boolean value) {
            fairyOptions_spawnSunflowerFairies.set(value);
        }

    }

    public interface HisouSwordOptions {
        int minHeightForPeaches();
        void minHeightForPeaches(int value);
        boolean canDisableShields();
        void canDisableShields(boolean value);
    }
    public interface HouraiElixirOptions {
        boolean canDrink();
        void canDrink(boolean value);
    }
    public interface ChiselOptions {
        boolean canUse();
        void canUse(boolean value);
        int maxDistance();
        void maxDistance(int value);
    }
    public interface fairyOptions {
        boolean spawnFairies();
        void spawnFairies(boolean value);
        boolean spawnSunflowerFairies();
        void spawnSunflowerFairies(boolean value);
    }
    public interface MochiMalletOptions {
        boolean lowViolence();
        void lowViolence(boolean value);
    }
    public interface NueTridentOptions {
        boolean canHaveImpaling();
        void canHaveImpaling(boolean value);
    }

}
