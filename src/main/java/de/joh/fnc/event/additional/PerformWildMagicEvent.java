package de.joh.fnc.event.additional;

import com.mna.api.spells.SpellPartTags;
import com.mna.api.spells.targeting.SpellTarget;
import de.joh.fnc.wildmagic.util.Quality;
import de.joh.fnc.wildmagic.util.WildMagic;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.Cancelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Cancelable
public class PerformWildMagicEvent extends LivingEvent {
    public final WildMagic wildMagic;

    @Nullable
    public final SpellTarget target;

    public final SpellPartTags componentTag;

    public PerformWildMagicEvent(@NotNull LivingEntity source, @Nullable SpellTarget target, @NotNull WildMagic wildMagic, @NotNull SpellPartTags componentTag) {
        super(source);
        this.wildMagic = wildMagic;
        this.target = target;
        this.componentTag = componentTag;
    }

    public LivingEntity getSource() {
        return super.getEntityLiving();
    }

    public Quality getQuality(){
        return wildMagic.getQuality(componentTag);
    }
}