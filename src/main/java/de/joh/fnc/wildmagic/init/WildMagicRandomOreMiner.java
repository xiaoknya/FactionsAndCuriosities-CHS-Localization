package de.joh.fnc.wildmagic.init;

import com.mna.api.spells.targeting.SpellTarget;
import de.joh.fnc.effect.EffectInit;
import de.joh.fnc.wildmagic.util.WildMagicPotionEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Gives the Target the {@link de.joh.fnc.effect.neutral.RandomOreMiner RandomOreMiner Effect} for 5 min
 * @author Joh0210
 */
public class WildMagicRandomOreMiner extends WildMagicPotionEffect {
    /**
     * @param registryName  ID under which the upgrade can be recognized
     * @param frequency     How often does the entry appear in the random-selection-list?
     */
    public WildMagicRandomOreMiner(@NotNull ResourceLocation registryName, int frequency) {
        super(registryName, frequency, true, 3000, 1);
    }

    @Override
    public boolean canBePerformed(@NotNull LivingEntity source, @Nullable SpellTarget target) {
        if(!(source instanceof Player)){
            return false;
        }

        return super.canBePerformed(source, target);
    }

    @Override
    public @NotNull MobEffect getMobEffect() {
        return EffectInit.RANDOM_ORE_MINER.get();
    }
}