package de.joh.fnc.item.init;

import com.mna.api.items.ChargeableItem;
import com.mna.items.artifice.curio.IPreEnchantedItem;
import de.joh.fnc.event.handler.MagicEventHandler;
import de.joh.fnc.factions.FactionInit;
import de.joh.fnc.utils.CreativeModeTabInit;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

/**
 * If the wearer of the bracelet hits someone with an unarmed punch, it will cause a Wild Magic Effect on the Target.
 * The Target can not gain anny good or very_good effects of it
 * @see MagicEventHandler
 * @author Joh0210
 */
public class BlackCatBracelet extends ChargeableItem implements IPreEnchantedItem<BlackCatBracelet> {
    public BlackCatBracelet() {
        super((new Item.Properties()).setNoRepair().tab(CreativeModeTabInit.FACTIONS_AND_CURIOSITIES).rarity(Rarity.UNCOMMON), 1000.0F);
    }

    protected boolean tickEffect(ItemStack stack, Player player, Level world, int slot, float mana, boolean selected) {
        return false;
    }

    protected boolean tickCurio() {
        return false;
    }

    public ResourceLocation getFaction() {
        return FactionInit.WILD.getRegistryName();
    }
}