package de.joh.fnc.common.init;

import com.mna.effects.EffectInit;
import de.joh.fnc.FactionsAndCuriosities;
import de.joh.fnc.common.wildmagic.*;
import de.joh.fnc.common.util.RLoc;
import de.joh.fnc.api.wildmagic.WildMagic;
import de.joh.fnc.api.wildmagic.WildMagicMCPotionEffect;
import de.joh.fnc.api.wildmagic.WildMagicOtherPotionEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

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
    public static void registerArmorUpgrades(final RegistryEvent.Register<WildMagic> event) {
        event.getRegistry().register(WildMagicInit.ABSORPTION_V_SELF);
        event.getRegistry().register(WildMagicInit.ABSORPTION_V_TARGET);
        event.getRegistry().register(WildMagicInit.ARMORED_DIAMOND_SELF);
        event.getRegistry().register(WildMagicInit.ARMORED_DIAMOND_TARGET);
        event.getRegistry().register(WildMagicInit.ARMORED_GOLD_SELF);
        event.getRegistry().register(WildMagicInit.ARMORED_GOLD_TARGET);
        event.getRegistry().register(WildMagicInit.ARMORED_IRON_SELF);
        event.getRegistry().register(WildMagicInit.ARMORED_IRON_TARGET);
        event.getRegistry().register(WildMagicInit.BAD_OMEN_SELF);
        event.getRegistry().register(WildMagicInit.BLINDNESS_SELF);
        event.getRegistry().register(WildMagicInit.BLINDNESS_TARGET);
        event.getRegistry().register(WildMagicInit.CHRONO_ANCHOR_SELF);
        event.getRegistry().register(WildMagicInit.DOLPHINS_GRACE_SELF);
        event.getRegistry().register(WildMagicInit.DOUBLE_TROUBLE);
        event.getRegistry().register(WildMagicInit.ELDRIN_SIGHT_SELF);
        event.getRegistry().register(WildMagicInit.EMPOWERED_III_SELF);
        event.getRegistry().register(WildMagicInit.EMPOWERED_III_TARGET);
        event.getRegistry().register(WildMagicInit.EMPOWERED_II_SELF);
        event.getRegistry().register(WildMagicInit.EMPOWERED_II_TARGET);
        event.getRegistry().register(WildMagicInit.EMPOWERED_I_SELF);
        event.getRegistry().register(WildMagicInit.EMPOWERED_I_TARGET);
        event.getRegistry().register(WildMagicInit.ENTANGLE_SELF);
        event.getRegistry().register(WildMagicInit.ENTANGLE_TARGET);
        event.getRegistry().register(WildMagicInit.EXPLODE_SPARE_SELF);
        event.getRegistry().register(WildMagicInit.EXPLODE_SPARE_TARGET);
        event.getRegistry().register(WildMagicInit.EXPLODE_STRONG_SELF);
        event.getRegistry().register(WildMagicInit.EXPLODE_STRONG_TARGET);
        event.getRegistry().register(WildMagicInit.EXPLODE_WEAK_SELF);
        event.getRegistry().register(WildMagicInit.EXPLODE_WEAK_TARGET);
        //event.getRegistry().register(WildMagicInit.EXPLODE_FAKE_SELF);
        event.getRegistry().register(WildMagicInit.FIRE_10_SELF);
        event.getRegistry().register(WildMagicInit.FIRE_10_TARGET);
        event.getRegistry().register(WildMagicInit.FIRE_15_SELF);
        event.getRegistry().register(WildMagicInit.FIRE_15_TARGET);
        event.getRegistry().register(WildMagicInit.FIRE_20_SELF);
        event.getRegistry().register(WildMagicInit.FIRE_20_TARGET);
        event.getRegistry().register(WildMagicInit.FIRE_5_SELF);
        event.getRegistry().register(WildMagicInit.FIRE_5_TARGET);
        event.getRegistry().register(WildMagicInit.FIRE_RESISTANCE_SELF);
        event.getRegistry().register(WildMagicInit.GRAVITY_WELL_SELF);
        event.getRegistry().register(WildMagicInit.GRAVITY_WELL_TARGET);
        event.getRegistry().register(WildMagicInit.HALF_LIVE_SELF);
        event.getRegistry().register(WildMagicInit.HALF_LIVE_TARGET);
        event.getRegistry().register(WildMagicInit.HEAL_SELF);
        event.getRegistry().register(WildMagicInit.HEAL_TARGET);
        event.getRegistry().register(WildMagicInit.HUNGER_EMPTY_SELF);
        event.getRegistry().register(WildMagicInit.HUNGER_EMPTY_TARGET);
        event.getRegistry().register(WildMagicInit.HUNGER_REFILL_SELF);
        event.getRegistry().register(WildMagicInit.HUNGER_REFILL_TARGET);
        event.getRegistry().register(WildMagicInit.LEVITATION_SELF);
        event.getRegistry().register(WildMagicInit.LEVITATION_TARGET);
        event.getRegistry().register(WildMagicInit.LIGHTNING_SELF);
        event.getRegistry().register(WildMagicInit.LIGHTNING_TARGET);
        event.getRegistry().register(WildMagicInit.LIVING_BOMB_SELF);
        event.getRegistry().register(WildMagicInit.LIVING_BOMB_TARGET);
        event.getRegistry().register(WildMagicInit.MANA_BOOST_II_SELF);
        event.getRegistry().register(WildMagicInit.MANA_BOOST_I_SELF);
        event.getRegistry().register(WildMagicInit.MAXIMIZED_SELF);
        event.getRegistry().register(WildMagicInit.MAXIMIZED_TARGET);
        event.getRegistry().register(WildMagicInit.MINIMIZED_SELF);
        event.getRegistry().register(WildMagicInit.MINIMIZED_TARGET);
        event.getRegistry().register(WildMagicInit.NAUSEA_SELF);
        event.getRegistry().register(WildMagicInit.NAUSEA_TARGET);
        event.getRegistry().register(WildMagicInit.POISON_STRONG_SELF);
        event.getRegistry().register(WildMagicInit.POISON_STRONG_TARGET);
        event.getRegistry().register(WildMagicInit.POISON_WEAK_SELF);
        event.getRegistry().register(WildMagicInit.POISON_WEAK_TARGET);
        event.getRegistry().register(WildMagicInit.QUARTER_LIVE_SELF);
        event.getRegistry().register(WildMagicInit.QUARTER_LIVE_TARGET);
        event.getRegistry().register(WildMagicInit.RANDOM_ORE_MINER);
        event.getRegistry().register(WildMagicInit.RANDOM_TP_SELF);
        event.getRegistry().register(WildMagicInit.RANDOM_TP_TARGET);
        event.getRegistry().register(WildMagicInit.REGENERATION_SELF);
        event.getRegistry().register(WildMagicInit.REGENERATION_TARGET);
        event.getRegistry().register(WildMagicInit.REMOVE_EFFECTS_SELF);
        event.getRegistry().register(WildMagicInit.REMOVE_EFFECTS_TARGET);
        event.getRegistry().register(WildMagicInit.REPAIR_SELF);
        event.getRegistry().register(WildMagicInit.RESISTANCE_II_SELF);
        event.getRegistry().register(WildMagicInit.RESISTANCE_II_TARGET);
        event.getRegistry().register(WildMagicInit.RESISTANCE_I_SELF);
        event.getRegistry().register(WildMagicInit.RESISTANCE_I_TARGET);
        event.getRegistry().register(WildMagicInit.SLOWNESS_SELF);
        event.getRegistry().register(WildMagicInit.SLOWNESS_TARGET);
        event.getRegistry().register(WildMagicInit.SLOW_FALLING_SELF);
        event.getRegistry().register(WildMagicInit.SPEED_SELF);
        event.getRegistry().register(WildMagicInit.SPEED_TARGET);
        event.getRegistry().register(WildMagicInit.SPELL_ADJUSTMENT);
        event.getRegistry().register(WildMagicInit.SPIDER_CLIMBING_SELF);
        event.getRegistry().register(WildMagicInit.STRENGTH_TARGET);
        event.getRegistry().register(WildMagicInit.TIME_DAY);
        event.getRegistry().register(WildMagicInit.TIME_NIGHT);
        event.getRegistry().register(WildMagicInit.TRUE_INVISIBILITY_SELF);
        event.getRegistry().register(WildMagicInit.TRUE_INVISIBILITY_TARGET);
        event.getRegistry().register(WildMagicInit.WATERY_GRAVE_SELF);
        event.getRegistry().register(WildMagicInit.WATERY_GRAVE_TARGET);
        event.getRegistry().register(WildMagicInit.WATER_BREATHING_SELF);
        event.getRegistry().register(WildMagicInit.WEAKNESS_II_TARGET);
        event.getRegistry().register(WildMagicInit.WEAKNESS_I_TARGET);
        event.getRegistry().register(WildMagicInit.WEATHER_RAIN);
        event.getRegistry().register(WildMagicInit.WEATHER_STORM);
        event.getRegistry().register(WildMagicInit.WEATHER_SUNSHINE);
        event.getRegistry().register(WildMagicInit.WITHER_STRONG_SELF);
        event.getRegistry().register(WildMagicInit.WITHER_STRONG_TARGET);
        event.getRegistry().register(WildMagicInit.WITHER_WEAK_SELF);
        event.getRegistry().register(WildMagicInit.WITHER_WEAK_TARGET);
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
