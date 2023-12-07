package de.joh.fnc.common.init;

import com.mna.effects.EffectInit;
import de.joh.fnc.FactionsAndCuriosities;
import de.joh.fnc.common.util.Registries;
import de.joh.fnc.common.wildmagic.*;
import de.joh.fnc.common.util.RLoc;
import de.joh.fnc.api.wildmagic.WildMagic;
import de.joh.fnc.api.wildmagic.WildMagicMCPotionEffect;
import de.joh.fnc.api.wildmagic.WildMagicOtherPotionEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegisterEvent;

/**
 * An initialization of all Wild Magics.
 * @see WildMagic
 * @author Joh0210
 */
@Mod.EventBusSubscriber(modid = FactionsAndCuriosities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WildMagicInit {
    public static WildMagic ABSORPTION_V_SELF;
    public static WildMagic ABSORPTION_V_TARGET;
    public static WildMagic ARMORED_DIAMOND_SELF;
    public static WildMagic ARMORED_DIAMOND_TARGET;
    public static WildMagic ARMORED_GOLD_SELF;
    public static WildMagic ARMORED_GOLD_TARGET;
    public static WildMagic ARMORED_IRON_SELF;
    public static WildMagic ARMORED_IRON_TARGET;
    public static WildMagic BAD_OMEN_SELF;
    public static WildMagic BLINDNESS_SELF;
    public static WildMagic BLINDNESS_TARGET;
    public static WildMagic CHRONO_ANCHOR_SELF;
    public static WildMagic DOLPHINS_GRACE_SELF;
    public static WildMagic DOUBLE_TROUBLE;
    public static WildMagic ELDRIN_SIGHT_SELF;
    public static WildMagic EMPOWERED_III_SELF;
    public static WildMagic EMPOWERED_III_TARGET;
    public static WildMagic EMPOWERED_II_SELF;
    public static WildMagic EMPOWERED_II_TARGET;
    public static WildMagic EMPOWERED_I_SELF;
    public static WildMagic EMPOWERED_I_TARGET;
    public static WildMagic ENTANGLE_SELF;
    public static WildMagic ENTANGLE_TARGET;
    public static WildMagic EXPLODE_SPARE_SELF;
    public static WildMagic EXPLODE_SPARE_TARGET;
    public static WildMagic EXPLODE_STRONG_SELF;
    public static WildMagic EXPLODE_STRONG_TARGET;
    public static WildMagic EXPLODE_WEAK_SELF;
    public static WildMagic EXPLODE_WEAK_TARGET;
    //public static WildMagic EXPLODE_FAKE_SELF;
    public static WildMagic FIRE_10_SELF;
    public static WildMagic FIRE_10_TARGET;
    public static WildMagic FIRE_15_SELF;
    public static WildMagic FIRE_15_TARGET;
    public static WildMagic FIRE_20_SELF;
    public static WildMagic FIRE_20_TARGET;
    public static WildMagic FIRE_5_SELF;
    public static WildMagic FIRE_5_TARGET;
    public static WildMagic FIRE_RESISTANCE_SELF;
    public static WildMagic GRAVITY_WELL_SELF;
    public static WildMagic GRAVITY_WELL_TARGET;
    public static WildMagic HALF_LIVE_SELF;
    public static WildMagic HALF_LIVE_TARGET;
    public static WildMagic HEAL_SELF;
    public static WildMagic HEAL_TARGET;
    public static WildMagic HEX_SELF;
    public static WildMagic HEX_TARGET;
    public static WildMagic HUNGER_EMPTY_SELF;
    public static WildMagic HUNGER_EMPTY_TARGET;
    public static WildMagic HUNGER_REFILL_SELF;
    public static WildMagic HUNGER_REFILL_TARGET;
    public static WildMagic LEVITATION_SELF;
    public static WildMagic LEVITATION_TARGET;
    public static WildMagic LIGHTNING_SELF;
    public static WildMagic LIGHTNING_TARGET;
    public static WildMagic LIVING_BOMB_SELF;
    public static WildMagic LIVING_BOMB_TARGET;
    public static WildMagic MANA_BOOST_II_SELF;
    public static WildMagic MANA_BOOST_I_SELF;
    public static WildMagic MAXIMIZED_SELF;
    public static WildMagic MAXIMIZED_TARGET;
    public static WildMagic MINIMIZED_SELF;
    public static WildMagic MINIMIZED_TARGET;
    public static WildMagic NAUSEA_SELF;
    public static WildMagic NAUSEA_TARGET;
    public static WildMagic POISON_STRONG_SELF;
    public static WildMagic POISON_STRONG_TARGET;
    public static WildMagic POISON_WEAK_SELF;
    public static WildMagic POISON_WEAK_TARGET;
    public static WildMagic QUARTER_LIVE_SELF;
    public static WildMagic QUARTER_LIVE_TARGET;
    public static WildMagic RANDOM_ORE_MINER;
    public static WildMagic RANDOM_TP_SELF;
    public static WildMagic RANDOM_TP_TARGET;
    public static WildMagic REGENERATION_SELF;
    public static WildMagic REGENERATION_TARGET;
    public static WildMagic REMOVE_EFFECTS_SELF;
    public static WildMagic REMOVE_EFFECTS_TARGET;
    public static WildMagic REPAIR_SELF;
    public static WildMagic RESISTANCE_II_SELF;
    public static WildMagic RESISTANCE_II_TARGET;
    public static WildMagic RESISTANCE_I_SELF;
    public static WildMagic RESISTANCE_I_TARGET;
    public static WildMagic SLOWNESS_SELF;
    public static WildMagic SLOWNESS_TARGET;
    public static WildMagic SLOW_FALLING_SELF;
    public static WildMagic SPEED_SELF;
    public static WildMagic SPEED_TARGET;
    public static WildMagic SPELL_ADJUSTMENT;
    public static WildMagic SPIDER_CLIMBING_SELF;
    public static WildMagic STRENGTH_TARGET;
    public static WildMagic TIME_DAY;
    public static WildMagic TIME_NIGHT;
    public static WildMagic TRUE_INVISIBILITY_SELF;
    public static WildMagic TRUE_INVISIBILITY_TARGET;
    public static WildMagic WATERY_GRAVE_SELF;
    public static WildMagic WATERY_GRAVE_TARGET;
    public static WildMagic WATER_BREATHING_SELF;
    public static WildMagic WEAKNESS_II_TARGET;
    public static WildMagic WEAKNESS_I_TARGET;
    public static WildMagic WEATHER_RAIN;
    public static WildMagic WEATHER_STORM;
    public static WildMagic WEATHER_SUNSHINE;
    public static WildMagic WITHER_STRONG_SELF;
    public static WildMagic WITHER_STRONG_TARGET;
    public static WildMagic WITHER_WEAK_SELF;
    public static WildMagic WITHER_WEAK_TARGET;

    @SubscribeEvent
    public static void register(RegisterEvent event) {
        event.register(Registries.WILD_MAGIC.get().getRegistryKey(), (helper) -> {
            helper.register(WildMagicInit.ABSORPTION_V_SELF.getRegistryName(), WildMagicInit.ABSORPTION_V_SELF);
            helper.register(WildMagicInit.ABSORPTION_V_TARGET.getRegistryName(), WildMagicInit.ABSORPTION_V_TARGET);
            helper.register(WildMagicInit.ARMORED_DIAMOND_SELF.getRegistryName(), WildMagicInit.ARMORED_DIAMOND_SELF);
            helper.register(WildMagicInit.ARMORED_DIAMOND_TARGET.getRegistryName(), WildMagicInit.ARMORED_DIAMOND_TARGET);
            helper.register(WildMagicInit.ARMORED_GOLD_SELF.getRegistryName(), WildMagicInit.ARMORED_GOLD_SELF);
            helper.register(WildMagicInit.ARMORED_GOLD_TARGET.getRegistryName(), WildMagicInit.ARMORED_GOLD_TARGET);
            helper.register(WildMagicInit.ARMORED_IRON_SELF.getRegistryName(), WildMagicInit.ARMORED_IRON_SELF);
            helper.register(WildMagicInit.ARMORED_IRON_TARGET.getRegistryName(), WildMagicInit.ARMORED_IRON_TARGET);
            helper.register(WildMagicInit.BAD_OMEN_SELF.getRegistryName(), WildMagicInit.BAD_OMEN_SELF);
            helper.register(WildMagicInit.BLINDNESS_SELF.getRegistryName(), WildMagicInit.BLINDNESS_SELF);
            helper.register(WildMagicInit.BLINDNESS_TARGET.getRegistryName(), WildMagicInit.BLINDNESS_TARGET);
            helper.register(WildMagicInit.CHRONO_ANCHOR_SELF.getRegistryName(), WildMagicInit.CHRONO_ANCHOR_SELF);
            helper.register(WildMagicInit.DOLPHINS_GRACE_SELF.getRegistryName(), WildMagicInit.DOLPHINS_GRACE_SELF);
            helper.register(WildMagicInit.DOUBLE_TROUBLE.getRegistryName(), WildMagicInit.DOUBLE_TROUBLE);helper.register(WildMagicInit.ELDRIN_SIGHT_SELF.getRegistryName(), WildMagicInit.ELDRIN_SIGHT_SELF);
            helper.register(WildMagicInit.EMPOWERED_III_SELF.getRegistryName(), WildMagicInit.EMPOWERED_III_SELF);
            helper.register(WildMagicInit.EMPOWERED_III_TARGET.getRegistryName(), WildMagicInit.EMPOWERED_III_TARGET);
            helper.register(WildMagicInit.EMPOWERED_II_SELF.getRegistryName(), WildMagicInit.EMPOWERED_II_SELF);
            helper.register(WildMagicInit.EMPOWERED_II_TARGET.getRegistryName(), WildMagicInit.EMPOWERED_II_TARGET);
            helper.register(WildMagicInit.EMPOWERED_I_SELF.getRegistryName(), WildMagicInit.EMPOWERED_I_SELF);
            helper.register(WildMagicInit.EMPOWERED_I_TARGET.getRegistryName(), WildMagicInit.EMPOWERED_I_TARGET);
            helper.register(WildMagicInit.ENTANGLE_SELF.getRegistryName(), WildMagicInit.ENTANGLE_SELF);
            helper.register(WildMagicInit.ENTANGLE_TARGET.getRegistryName(), WildMagicInit.ENTANGLE_TARGET);
            helper.register(WildMagicInit.EXPLODE_SPARE_SELF.getRegistryName(), WildMagicInit.EXPLODE_SPARE_SELF);
            helper.register(WildMagicInit.EXPLODE_SPARE_TARGET.getRegistryName(), WildMagicInit.EXPLODE_SPARE_TARGET);
            helper.register(WildMagicInit.EXPLODE_STRONG_SELF.getRegistryName(), WildMagicInit.EXPLODE_STRONG_SELF);
            helper.register(WildMagicInit.EXPLODE_STRONG_TARGET.getRegistryName(), WildMagicInit.EXPLODE_STRONG_TARGET);
            helper.register(WildMagicInit.EXPLODE_WEAK_SELF.getRegistryName(), WildMagicInit.EXPLODE_WEAK_SELF);
            helper.register(WildMagicInit.EXPLODE_WEAK_TARGET.getRegistryName(), WildMagicInit.EXPLODE_WEAK_TARGET);
            //helper.register(WildMagicInit.EXPLODE_FAKE_SELF.getRegistryName(), WildMagicInit.EXPLODE_FAKE_SELF);
            helper.register(WildMagicInit.FIRE_10_SELF.getRegistryName(), WildMagicInit.FIRE_10_SELF);
            helper.register(WildMagicInit.FIRE_10_TARGET.getRegistryName(), WildMagicInit.FIRE_10_TARGET);
            helper.register(WildMagicInit.FIRE_15_SELF.getRegistryName(), WildMagicInit.FIRE_15_SELF);
            helper.register(WildMagicInit.FIRE_15_TARGET.getRegistryName(), WildMagicInit.FIRE_15_TARGET);
            helper.register(WildMagicInit.FIRE_20_SELF.getRegistryName(), WildMagicInit.FIRE_20_SELF);
            helper.register(WildMagicInit.FIRE_20_TARGET.getRegistryName(), WildMagicInit.FIRE_20_TARGET);
            helper.register(WildMagicInit.FIRE_5_SELF.getRegistryName(), WildMagicInit.FIRE_5_SELF);
            helper.register(WildMagicInit.FIRE_5_TARGET.getRegistryName(), WildMagicInit.FIRE_5_TARGET);
            helper.register(WildMagicInit.FIRE_RESISTANCE_SELF.getRegistryName(), WildMagicInit.FIRE_RESISTANCE_SELF);
            helper.register(WildMagicInit.GRAVITY_WELL_SELF.getRegistryName(), WildMagicInit.GRAVITY_WELL_SELF);
            helper.register(WildMagicInit.GRAVITY_WELL_TARGET.getRegistryName(), WildMagicInit.GRAVITY_WELL_TARGET);
            helper.register(WildMagicInit.HALF_LIVE_SELF.getRegistryName(), WildMagicInit.HALF_LIVE_SELF);
            helper.register(WildMagicInit.HALF_LIVE_TARGET.getRegistryName(), WildMagicInit.HALF_LIVE_TARGET);
            helper.register(WildMagicInit.HEAL_SELF.getRegistryName(), WildMagicInit.HEAL_SELF);
            helper.register(WildMagicInit.HEAL_TARGET.getRegistryName(), WildMagicInit.HEAL_TARGET);
            helper.register(WildMagicInit.HEX_SELF.getRegistryName(), WildMagicInit.HEX_SELF);
            helper.register(WildMagicInit.HEX_TARGET.getRegistryName(), WildMagicInit.HEX_TARGET);
            helper.register(WildMagicInit.HUNGER_EMPTY_SELF.getRegistryName(), WildMagicInit.HUNGER_EMPTY_SELF);
            helper.register(WildMagicInit.HUNGER_EMPTY_TARGET.getRegistryName(), WildMagicInit.HUNGER_EMPTY_TARGET);
            helper.register(WildMagicInit.HUNGER_REFILL_SELF.getRegistryName(), WildMagicInit.HUNGER_REFILL_SELF);
            helper.register(WildMagicInit.HUNGER_REFILL_TARGET.getRegistryName(), WildMagicInit.HUNGER_REFILL_TARGET);
            helper.register(WildMagicInit.LEVITATION_SELF.getRegistryName(), WildMagicInit.LEVITATION_SELF);
            helper.register(WildMagicInit.LEVITATION_TARGET.getRegistryName(), WildMagicInit.LEVITATION_TARGET);
            helper.register(WildMagicInit.LIGHTNING_SELF.getRegistryName(), WildMagicInit.LIGHTNING_SELF);
            helper.register(WildMagicInit.LIGHTNING_TARGET.getRegistryName(), WildMagicInit.LIGHTNING_TARGET);
            helper.register(WildMagicInit.LIVING_BOMB_SELF.getRegistryName(), WildMagicInit.LIVING_BOMB_SELF);
            helper.register(WildMagicInit.LIVING_BOMB_TARGET.getRegistryName(), WildMagicInit.LIVING_BOMB_TARGET);
            helper.register(WildMagicInit.MANA_BOOST_II_SELF.getRegistryName(), WildMagicInit.MANA_BOOST_II_SELF);
            helper.register(WildMagicInit.MANA_BOOST_I_SELF.getRegistryName(), WildMagicInit.MANA_BOOST_I_SELF);
            helper.register(WildMagicInit.MAXIMIZED_SELF.getRegistryName(), WildMagicInit.MAXIMIZED_SELF);
            helper.register(WildMagicInit.MAXIMIZED_TARGET.getRegistryName(), WildMagicInit.MAXIMIZED_TARGET);
            helper.register(WildMagicInit.MINIMIZED_SELF.getRegistryName(), WildMagicInit.MINIMIZED_SELF);
            helper.register(WildMagicInit.MINIMIZED_TARGET.getRegistryName(), WildMagicInit.MINIMIZED_TARGET);
            helper.register(WildMagicInit.NAUSEA_SELF.getRegistryName(), WildMagicInit.NAUSEA_SELF);
            helper.register(WildMagicInit.NAUSEA_TARGET.getRegistryName(), WildMagicInit.NAUSEA_TARGET);
            helper.register(WildMagicInit.POISON_STRONG_SELF.getRegistryName(), WildMagicInit.POISON_STRONG_SELF);
            helper.register(WildMagicInit.POISON_STRONG_TARGET.getRegistryName(), WildMagicInit.POISON_STRONG_TARGET);
            helper.register(WildMagicInit.POISON_WEAK_SELF.getRegistryName(), WildMagicInit.POISON_WEAK_SELF);
            helper.register(WildMagicInit.POISON_WEAK_TARGET.getRegistryName(), WildMagicInit.POISON_WEAK_TARGET);
            helper.register(WildMagicInit.QUARTER_LIVE_SELF.getRegistryName(), WildMagicInit.QUARTER_LIVE_SELF);
            helper.register(WildMagicInit.QUARTER_LIVE_TARGET.getRegistryName(), WildMagicInit.QUARTER_LIVE_TARGET);
            helper.register(WildMagicInit.RANDOM_ORE_MINER.getRegistryName(), WildMagicInit.RANDOM_ORE_MINER);
            helper.register(WildMagicInit.RANDOM_TP_SELF.getRegistryName(), WildMagicInit.RANDOM_TP_SELF);
            helper.register(WildMagicInit.RANDOM_TP_TARGET.getRegistryName(), WildMagicInit.RANDOM_TP_TARGET);
            helper.register(WildMagicInit.REGENERATION_SELF.getRegistryName(), WildMagicInit.REGENERATION_SELF);
            helper.register(WildMagicInit.REGENERATION_TARGET.getRegistryName(), WildMagicInit.REGENERATION_TARGET);
            helper.register(WildMagicInit.REMOVE_EFFECTS_SELF.getRegistryName(), WildMagicInit.REMOVE_EFFECTS_SELF);
            helper.register(WildMagicInit.REMOVE_EFFECTS_TARGET.getRegistryName(), WildMagicInit.REMOVE_EFFECTS_TARGET);
            helper.register(WildMagicInit.REPAIR_SELF.getRegistryName(), WildMagicInit.REPAIR_SELF);
            helper.register(WildMagicInit.RESISTANCE_II_SELF.getRegistryName(), WildMagicInit.RESISTANCE_II_SELF);
            helper.register(WildMagicInit.RESISTANCE_II_TARGET.getRegistryName(), WildMagicInit.RESISTANCE_II_TARGET);
            helper.register(WildMagicInit.RESISTANCE_I_SELF.getRegistryName(), WildMagicInit.RESISTANCE_I_SELF);
            helper.register(WildMagicInit.RESISTANCE_I_TARGET.getRegistryName(), WildMagicInit.RESISTANCE_I_TARGET);
            helper.register(WildMagicInit.SLOWNESS_SELF.getRegistryName(), WildMagicInit.SLOWNESS_SELF);
            helper.register(WildMagicInit.SLOWNESS_TARGET.getRegistryName(), WildMagicInit.SLOWNESS_TARGET);
            helper.register(WildMagicInit.SLOW_FALLING_SELF.getRegistryName(), WildMagicInit.SLOW_FALLING_SELF);
            helper.register(WildMagicInit.SPEED_SELF.getRegistryName(), WildMagicInit.SPEED_SELF);
            helper.register(WildMagicInit.SPEED_TARGET.getRegistryName(), WildMagicInit.SPEED_TARGET);
            helper.register(WildMagicInit.SPELL_ADJUSTMENT.getRegistryName(), WildMagicInit.SPELL_ADJUSTMENT);
            helper.register(WildMagicInit.SPIDER_CLIMBING_SELF.getRegistryName(), WildMagicInit.SPIDER_CLIMBING_SELF);
            helper.register(WildMagicInit.STRENGTH_TARGET.getRegistryName(), WildMagicInit.STRENGTH_TARGET);
            helper.register(WildMagicInit.TIME_DAY.getRegistryName(), WildMagicInit.TIME_DAY);
            helper.register(WildMagicInit.TIME_NIGHT.getRegistryName(), WildMagicInit.TIME_NIGHT);
            helper.register(WildMagicInit.TRUE_INVISIBILITY_SELF.getRegistryName(), WildMagicInit.TRUE_INVISIBILITY_SELF);
            helper.register(WildMagicInit.TRUE_INVISIBILITY_TARGET.getRegistryName(), WildMagicInit.TRUE_INVISIBILITY_TARGET);
            helper.register(WildMagicInit.WATERY_GRAVE_SELF.getRegistryName(), WildMagicInit.WATERY_GRAVE_SELF);
            helper.register(WildMagicInit.WATERY_GRAVE_TARGET.getRegistryName(), WildMagicInit.WATERY_GRAVE_TARGET);
            helper.register(WildMagicInit.WATER_BREATHING_SELF.getRegistryName(), WildMagicInit.WATER_BREATHING_SELF);
            helper.register(WildMagicInit.WEAKNESS_II_TARGET.getRegistryName(), WildMagicInit.WEAKNESS_II_TARGET);
            helper.register(WildMagicInit.WEAKNESS_I_TARGET.getRegistryName(), WildMagicInit.WEAKNESS_I_TARGET);
            helper.register(WildMagicInit.WEATHER_RAIN.getRegistryName(), WildMagicInit.WEATHER_RAIN);
            helper.register(WildMagicInit.WEATHER_STORM.getRegistryName(), WildMagicInit.WEATHER_STORM);
            helper.register(WildMagicInit.WEATHER_SUNSHINE.getRegistryName(), WildMagicInit.WEATHER_SUNSHINE);
            helper.register(WildMagicInit.WITHER_STRONG_SELF.getRegistryName(), WildMagicInit.WITHER_STRONG_SELF);
            helper.register(WildMagicInit.WITHER_STRONG_TARGET.getRegistryName(), WildMagicInit.WITHER_STRONG_TARGET);
            helper.register(WildMagicInit.WITHER_WEAK_SELF.getRegistryName(), WildMagicInit.WITHER_WEAK_SELF);
            helper.register(WildMagicInit.WITHER_WEAK_TARGET.getRegistryName(), WildMagicInit.WITHER_WEAK_TARGET);
        });
    }

    static {
        WildMagicInit.ABSORPTION_V_SELF = new WildMagicMCPotionEffect(RLoc.create("wildmagic/absorption_v_self"), 2, true, MobEffects.ABSORPTION, 12000, 5);
        WildMagicInit.ABSORPTION_V_TARGET = new WildMagicMCPotionEffect(RLoc.create("wildmagic/absorption_v_target"), 1, false, MobEffects.ABSORPTION, 12000, 5);
        WildMagicInit.ARMORED_DIAMOND_SELF = new ArmoredWildMagic(RLoc.create("wildmagic/armored_diamond_self"), 1, true, ArmoredWildMagic.Type.DIAMOND);
        WildMagicInit.ARMORED_DIAMOND_TARGET = new ArmoredWildMagic(RLoc.create("wildmagic/armored_diamond_target"), 1, false, ArmoredWildMagic.Type.DIAMOND);
        WildMagicInit.ARMORED_GOLD_SELF = new ArmoredWildMagic(RLoc.create("wildmagic/armored_gold_self"), 6, true, ArmoredWildMagic.Type.GOLD);
        WildMagicInit.ARMORED_GOLD_TARGET = new ArmoredWildMagic(RLoc.create("wildmagic/armored_gold_target"), 6, false, ArmoredWildMagic.Type.GOLD);
        WildMagicInit.ARMORED_IRON_SELF = new ArmoredWildMagic(RLoc.create("wildmagic/armored_iron_self"), 3, true, ArmoredWildMagic.Type.IRON);
        WildMagicInit.ARMORED_IRON_TARGET = new ArmoredWildMagic(RLoc.create("wildmagic/armored_iron_target"), 3, false, ArmoredWildMagic.Type.IRON);
        WildMagicInit.BAD_OMEN_SELF = new WildMagicMCPotionEffect(RLoc.create("wildmagic/bad_omen_self"), 1, true, MobEffects.BAD_OMEN, 12000, 1);
        WildMagicInit.BLINDNESS_SELF = new BlindnessWildMagic(RLoc.create("wildmagic/blindness_self"), 2, true);
        WildMagicInit.BLINDNESS_TARGET = new BlindnessWildMagic(RLoc.create("wildmagic/blindness_target"), 4, false);
        WildMagicInit.CHRONO_ANCHOR_SELF = new ChronoAnchorWildMagic(RLoc.create("wildmagic/chrono_anchor_self"), 2);
        WildMagicInit.DOLPHINS_GRACE_SELF = new DolphinsGraceWildMagic(RLoc.create("wildmagic/dolphins_grace_self"), 7);
        WildMagicInit.DOUBLE_TROUBLE = new DoubleTroubleWildMagic(RLoc.create("wildmagic/double_truble"), 4);
        WildMagicInit.ELDRIN_SIGHT_SELF = new EldrinSightWildMagic(RLoc.create("wildmagic/eldrin_sight_self"), 3);
        WildMagicInit.EMPOWERED_III_SELF = new EmpoweredWildMagic(RLoc.create("wildmagic/empowered_iii_self"), 1, true, 3);
        WildMagicInit.EMPOWERED_III_TARGET = new EmpoweredWildMagic(RLoc.create("wildmagic/empowered_iii_target"), 1, false, 3);
        WildMagicInit.EMPOWERED_II_SELF = new EmpoweredWildMagic(RLoc.create("wildmagic/empowered_ii_self"), 2, true, 2);
        WildMagicInit.EMPOWERED_II_TARGET = new EmpoweredWildMagic(RLoc.create("wildmagic/empowered_ii_target"), 2, false, 2);
        WildMagicInit.EMPOWERED_I_SELF = new EmpoweredWildMagic(RLoc.create("wildmagic/empowered_i_self"), 4, true, 1);
        WildMagicInit.EMPOWERED_I_TARGET = new EmpoweredWildMagic(RLoc.create("wildmagic/empowered_i_target"), 4, false, 1);
        WildMagicInit.ENTANGLE_SELF = new WildMagicOtherPotionEffect(RLoc.create("wildmagic/entangle_self"), 2, true, EffectInit.ENTANGLE, 300, 1, true, true);
        WildMagicInit.ENTANGLE_TARGET = new WildMagicOtherPotionEffect(RLoc.create("wildmagic/entangle_target"), 5, false, EffectInit.ENTANGLE, 300, 1, true, true);
        WildMagicInit.EXPLODE_SPARE_SELF = new ExplosionWildMagic(RLoc.create("wildmagic/explode_spare_self"), 5, true, 8, false, true);
        WildMagicInit.EXPLODE_SPARE_TARGET = new ExplosionWildMagic(RLoc.create("wildmagic/explode_spare_target"), 4, false, 8, false, true);
        WildMagicInit.EXPLODE_STRONG_SELF = new ExplosionWildMagic(RLoc.create("wildmagic/explode_strong_self"), 1, true, 4, false);
        WildMagicInit.EXPLODE_STRONG_TARGET = new ExplosionWildMagic(RLoc.create("wildmagic/explode_strong_target"), 3, false, 4, false);
        WildMagicInit.EXPLODE_WEAK_SELF = new ExplosionWildMagic(RLoc.create("wildmagic/explode_weak_self"), 4, true, 2, false);
        WildMagicInit.EXPLODE_WEAK_TARGET = new ExplosionWildMagic(RLoc.create("wildmagic/explode_weak_target"), 5, false, 2, false);
        //WildMagicInit.EXPLODE_FAKE_SELF = new WildMagicExplosion(RLoc.create("wildmagic/explode_fake_self"), 7, true, 0, false);
        WildMagicInit.FIRE_10_SELF = new FireWildMagic(RLoc.create("wildmagic/fire_10_self"), 3, true, 10);
        WildMagicInit.FIRE_10_TARGET = new FireWildMagic(RLoc.create("wildmagic/fire_10_target"), 3, false, 10);
        WildMagicInit.FIRE_15_SELF = new FireWildMagic(RLoc.create("wildmagic/fire_15_self"), 2, true, 15);
        WildMagicInit.FIRE_15_TARGET = new FireWildMagic(RLoc.create("wildmagic/fire_15_target"), 2, false, 15);
        WildMagicInit.FIRE_20_SELF = new FireWildMagic(RLoc.create("wildmagic/fire_20_self"), 1, true, 20);
        WildMagicInit.FIRE_20_TARGET = new FireWildMagic(RLoc.create("wildmagic/fire_20_target"), 1, false, 20);
        WildMagicInit.FIRE_5_SELF = new FireWildMagic(RLoc.create("wildmagic/fire_5_self"), 5, true, 5);
        WildMagicInit.FIRE_5_TARGET = new FireWildMagic(RLoc.create("wildmagic/fire_5_target"), 5, false, 5);
        WildMagicInit.FIRE_RESISTANCE_SELF = new FireResistanceWildMagic(RLoc.create("wildmagic/fire_resistance_self"), 7, true);
        WildMagicInit.GRAVITY_WELL_SELF = new WildMagicOtherPotionEffect(RLoc.create("wildmagic/gravity_well_self"), 1, true, EffectInit.GRAVITY_WELL, 600, 1);
        WildMagicInit.GRAVITY_WELL_TARGET = new WildMagicOtherPotionEffect(RLoc.create("wildmagic/gravity_well_target"), 4, false, EffectInit.GRAVITY_WELL, 600, 1);
        WildMagicInit.HALF_LIVE_SELF = new ReduceHPWildMagic(RLoc.create("wildmagic/half_live_self"), 1, true, 0.5f, 50);
        WildMagicInit.HALF_LIVE_TARGET = new ReduceHPWildMagic(RLoc.create("wildmagic/half_live_target"), 1, false, 0.5f, 50);
        WildMagicInit.HEAL_SELF = new HealWildMagic(RLoc.create("wildmagic/heal_self"), 4, true);
        WildMagicInit.HEAL_TARGET = new HealWildMagic(RLoc.create("wildmagic/heal_target"), 3, false);
        WildMagicInit.HEX_SELF = new WildMagicOtherPotionEffect(RLoc.create("wildmagic/hex_self"), 4, true, de.joh.fnc.common.init.EffectInit.HEX, 600, 2);
        WildMagicInit.HEX_TARGET = new WildMagicOtherPotionEffect(RLoc.create("wildmagic/hex_target"), 3, false, de.joh.fnc.common.init.EffectInit.HEX, 600, 2);
        WildMagicInit.HUNGER_EMPTY_SELF = new HungerWildMagic(RLoc.create("wildmagic/hunger_empty_self"), 5, true, true);
        WildMagicInit.HUNGER_EMPTY_TARGET = new HungerWildMagic(RLoc.create("wildmagic/hunger_empty_target"), 5, false, true);
        WildMagicInit.HUNGER_REFILL_SELF = new HungerWildMagic(RLoc.create("wildmagic/hunger_refill_self"), 5, true, false);
        WildMagicInit.HUNGER_REFILL_TARGET = new HungerWildMagic(RLoc.create("wildmagic/hunger_refill_target"), 5, false, false);
        WildMagicInit.LEVITATION_SELF = new WildMagicMCPotionEffect(RLoc.create("wildmagic/levitation_self"), 3, true, MobEffects.LEVITATION, 400, 1);
        WildMagicInit.LEVITATION_TARGET = new WildMagicMCPotionEffect(RLoc.create("wildmagic/weakness_target"), 3, false, MobEffects.LEVITATION, 400, 1);
        WildMagicInit.LIGHTNING_SELF = new LightningWildMagic(RLoc.create("wildmagic/lightning_self"), 2, true);
        WildMagicInit.LIGHTNING_TARGET = new LightningWildMagic(RLoc.create("wildmagic/lightning_target"), 4, false);
        WildMagicInit.LIVING_BOMB_SELF = new LivingBombWildMagic(RLoc.create("wildmagic/living_bomb_self"), 2, true, 1);
        WildMagicInit.LIVING_BOMB_TARGET = new LivingBombWildMagic(RLoc.create("wildmagic/living_bomb_target"), 2, false, 1);
        WildMagicInit.MANA_BOOST_II_SELF = new ManaBoostWildMagic(RLoc.create("wildmagic/mana_boost_ii_self"), 1, 5);
        WildMagicInit.MANA_BOOST_I_SELF = new ManaBoostWildMagic(RLoc.create("wildmagic/mana_boost_i_self"), 3, 2);
        WildMagicInit.MAXIMIZED_SELF = new MaximizeWildMagic(RLoc.create("wildmagic/maximize_self"), 4, true);
        WildMagicInit.MAXIMIZED_TARGET = new MaximizeWildMagic(RLoc.create("wildmagic/maximize_target"), 4, false);
        WildMagicInit.MINIMIZED_SELF = new MinimizeWildMagic(RLoc.create("wildmagic/minimize_self"), 3, true);
        WildMagicInit.MINIMIZED_TARGET = new MinimizeWildMagic(RLoc.create("wildmagic/minimize_target"), 3, false);
        WildMagicInit.NAUSEA_SELF = new NauseaWildMagic(RLoc.create("wildmagic/nausea_self"), 4, true);
        WildMagicInit.NAUSEA_TARGET = new NauseaWildMagic(RLoc.create("wildmagic/nausea_target"), 4, false);
        WildMagicInit.POISON_STRONG_SELF = new PoisonWildMagic(RLoc.create("wildmagic/poison_strong_self"), 1, true, 2);
        WildMagicInit.POISON_STRONG_TARGET = new PoisonWildMagic(RLoc.create("wildmagic/poison_strong_target"), 2, false, 2);
        WildMagicInit.POISON_WEAK_SELF = new PoisonWildMagic(RLoc.create("wildmagic/poison_weak_self"), 4, true, 1);
        WildMagicInit.POISON_WEAK_TARGET = new PoisonWildMagic(RLoc.create("wildmagic/poison_weak_target"), 3, false, 1);
        WildMagicInit.QUARTER_LIVE_SELF = new ReduceHPWildMagic(RLoc.create("wildmagic/quarter_live_self"), 3, true, 0.25f, 50);
        WildMagicInit.QUARTER_LIVE_TARGET = new ReduceHPWildMagic(RLoc.create("wildmagic/quarter_live_target"), 3, false, 0.25f, 50);
        WildMagicInit.RANDOM_ORE_MINER = new RandomOreMinerWildMagic(RLoc.create("wildmagic/random_ore_miner_self"), 6);
        WildMagicInit.RANDOM_TP_SELF = new RandomTpWildMagic(RLoc.create("wildmagic/random_tp_self"), 4, 32, true);
        WildMagicInit.RANDOM_TP_TARGET = new RandomTpWildMagic(RLoc.create("wildmagic/random_tp_target"), 5, 32, false);
        WildMagicInit.REGENERATION_SELF = new RegenerationWildMagic(RLoc.create("wildmagic/regeneration_self"), 2, false);
        WildMagicInit.REGENERATION_TARGET = new RegenerationWildMagic(RLoc.create("wildmagic/regeneration_target"), 1, false);
        WildMagicInit.REMOVE_EFFECTS_SELF = new RemoveEffectsWildMagic(RLoc.create("wildmagic/remove_effects_self"), 5, true);
        WildMagicInit.REMOVE_EFFECTS_TARGET = new RemoveEffectsWildMagic(RLoc.create("wildmagic/remove_effects_target"), 5, false);
        WildMagicInit.REPAIR_SELF = new RepairWildMagic(RLoc.create("wildmagic/repair_self"), 2);
        WildMagicInit.RESISTANCE_II_SELF = new WildMagicMCPotionEffect(RLoc.create("wildmagic/resistance_ii_self"), 1, true, MobEffects.DAMAGE_RESISTANCE, 2400, 2, true, false);
        WildMagicInit.RESISTANCE_II_TARGET = new WildMagicMCPotionEffect(RLoc.create("wildmagic/resistance_ii_target"), 1, false, MobEffects.DAMAGE_RESISTANCE, 2400, 2, true, false);
        WildMagicInit.RESISTANCE_I_SELF = new WildMagicMCPotionEffect(RLoc.create("wildmagic/resistance_i_self"), 3, true, MobEffects.DAMAGE_RESISTANCE, 2400, 1);
        WildMagicInit.RESISTANCE_I_TARGET = new WildMagicMCPotionEffect(RLoc.create("wildmagic/resistance_i_target"), 2, false, MobEffects.DAMAGE_RESISTANCE, 2400, 1);
        WildMagicInit.SLOWNESS_SELF = new WildMagicMCPotionEffect(RLoc.create("wildmagic/slowness_self"), 4, true, MobEffects.MOVEMENT_SLOWDOWN, 600, 2);
        WildMagicInit.SLOWNESS_TARGET = new WildMagicMCPotionEffect(RLoc.create("wildmagic/slowness_target"), 6, false, MobEffects.MOVEMENT_SLOWDOWN, 600, 2);
        WildMagicInit.SLOW_FALLING_SELF = new WildMagicMCPotionEffect(RLoc.create("wildmagic/slow_falling_self"), 4, true, MobEffects.SLOW_FALLING, 6000, 1);
        WildMagicInit.SPEED_SELF = new WildMagicMCPotionEffect(RLoc.create("wildmagic/speed_self"), 6, true, MobEffects.MOVEMENT_SPEED, 2400, 2);
        WildMagicInit.SPEED_TARGET = new WildMagicMCPotionEffect(RLoc.create("wildmagic/speed_target"), 4, false, MobEffects.MOVEMENT_SPEED, 2400, 2);
        WildMagicInit.SPELL_ADJUSTMENT = new RandomSpellAdjustmentWildMagic(RLoc.create("wildmagic/random_spell_adjustment_self"), 9);
        WildMagicInit.SPIDER_CLIMBING_SELF = new WildMagicOtherPotionEffect(RLoc.create("wildmagic/spider_climbing_self"), 4, true, EffectInit.SPIDER_CLIMBING, 6000, 1);
        WildMagicInit.STRENGTH_TARGET = new WildMagicMCPotionEffect(RLoc.create("wildmagic/strength_target"), 4, false, MobEffects.DAMAGE_BOOST, 1200, 2);
        WildMagicInit.TIME_DAY = new TimeWildMagic(RLoc.create("wildmagic/time_day"), 1, true);
        WildMagicInit.TIME_NIGHT = new TimeWildMagic(RLoc.create("wildmagic/time_night"), 1, false);
        WildMagicInit.TRUE_INVISIBILITY_SELF = new WildMagicOtherPotionEffect(RLoc.create("wildmagic/true_invisibility_self"), 2, true, EffectInit.TRUE_INVISIBILITY, 1200, 1, true, false);
        WildMagicInit.TRUE_INVISIBILITY_TARGET = new WildMagicOtherPotionEffect(RLoc.create("wildmagic/true_invisibility_target"), 1, false, EffectInit.TRUE_INVISIBILITY, 1200, 1, true, false);
        WildMagicInit.WATERY_GRAVE_SELF = new WateryGraveWildMagic(RLoc.create("wildmagic/watery_grave_self"), 2, true);
        WildMagicInit.WATERY_GRAVE_TARGET = new WateryGraveWildMagic(RLoc.create("wildmagic/watery_grave_target"), 5, false);
        WildMagicInit.WATER_BREATHING_SELF = new WaterBreathingWildMagic(RLoc.create("wildmagic/water_breathing_self"), 7, true);
        WildMagicInit.WEAKNESS_II_TARGET = new WildMagicMCPotionEffect(RLoc.create("wildmagic/weakness_ii_target"), 3, false, MobEffects.WEAKNESS, 600, 2);
        WildMagicInit.WEAKNESS_I_TARGET = new WildMagicMCPotionEffect(RLoc.create("wildmagic/weakness_i_target"), 6, false, MobEffects.WEAKNESS, 600, 1);
        WildMagicInit.WEATHER_RAIN = new WeatherWildMagic(RLoc.create("wildmagic/weather_rain"), 1, true, false);
        WildMagicInit.WEATHER_STORM = new WeatherWildMagic(RLoc.create("wildmagic/weather_storm"), 1, true, true);
        WildMagicInit.WEATHER_SUNSHINE = new WeatherWildMagic(RLoc.create("wildmagic/weather_sunshine"), 1, false, false);
        WildMagicInit.WITHER_STRONG_SELF = new WitherWildMagic(RLoc.create("wildmagic/wither_strong_self"), 1, true, 2);
        WildMagicInit.WITHER_STRONG_TARGET = new WitherWildMagic(RLoc.create("wildmagic/wither_strong_target"), 2, false, 2);
        WildMagicInit.WITHER_WEAK_SELF = new WitherWildMagic(RLoc.create("wildmagic/wither_weak_self"), 4, true, 1);
        WildMagicInit.WITHER_WEAK_TARGET = new WitherWildMagic(RLoc.create("wildmagic/wither_weak_target"), 3, false, 1);
    }
}
