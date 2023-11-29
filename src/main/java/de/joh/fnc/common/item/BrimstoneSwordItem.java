package de.joh.fnc.common.item;

import com.mna.api.items.IFactionSpecific;
import de.joh.fnc.api.util.CreativeModeTabInit;
import de.joh.fnc.common.event.DamageEventHandler;
import de.joh.fnc.common.init.FactionInit;
import de.joh.fnc.common.item.material.ToolMaterials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import org.jetbrains.annotations.NotNull;

/**
 * If the Player Uses this Sword to Smite, he regains half the applied Smite-Damage as HP.
 * <br>This Effect only works on the actual HP (Absorption or other hit pools will be ignored)
 * @see DamageEventHandler
 * @author Joh0210
 */
public class BrimstoneSwordItem extends SwordItem implements IFactionSpecific {
    public BrimstoneSwordItem() {
        super(ToolMaterials.LIVE_RIP, 2, -2.4F, new Item.Properties().stacksTo(1).tab(CreativeModeTabInit.FACTIONS_AND_CURIOSITIES).rarity(Rarity.EPIC).fireResistant());
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack stack, @NotNull LivingEntity target, @NotNull LivingEntity attacker) {
        if(attacker instanceof Player){
            this.usedByPlayer((Player) attacker);
        }

        return super.hurtEnemy(stack, target, attacker);
    }

    @Override
    public ResourceLocation getFaction() {
        return FactionInit.PALADIN.getRegistryName();
    }
}