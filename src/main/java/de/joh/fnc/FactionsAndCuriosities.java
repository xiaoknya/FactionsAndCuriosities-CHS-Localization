package de.joh.fnc;

import com.mna.api.guidebook.RegisterGuidebooksEvent;
import com.mojang.logging.LogUtils;
import de.joh.fnc.compat.AddonCompatibleManager;
import de.joh.fnc.effect.EffectInit;
import de.joh.fnc.item.ItemInit;
import de.joh.fnc.networking.Messages;
import de.joh.fnc.utils.AttributeInit;
import de.joh.fnc.utils.RLoc;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.Bindings;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

/**
 * Main class of this mod, and initialization of some elements.
 * @author Joh0210
 */
@Mod(FactionsAndCuriosities.MOD_ID)
public class FactionsAndCuriosities {
    public static FactionsAndCuriosities instance;
    public static final String MOD_ID = "fnc";
    public static final Logger LOGGER = LogUtils.getLogger();

    public FactionsAndCuriosities() {
        instance = this;

        IEventBus forgeEventBus = Bindings.getForgeBus().get();
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.register(modEventBus);
        EffectInit.register(modEventBus);
        AttributeInit.register(modEventBus);

        modEventBus.addListener(this::setup);

        AddonCompatibleManager.visit();

        MinecraftForge.EVENT_BUS.register(this);
    }

    public final Player getClientPlayer() {
        return Minecraft.getInstance().player;
    }

    private void setup(final FMLCommonSetupEvent event){
        event.enqueueWork(Messages::register);

        LOGGER.info(MOD_ID + ": init");
    }
    /**
     * Registration of the ingame guide.
     */
    @SubscribeEvent
    public void onRegisterGuidebooks(final RegisterGuidebooksEvent event) {
        event.getRegistry().addGuidebookPath(RLoc.create("guide/base"));

        if(AddonCompatibleManager.DMNR.isLoaded()){
            event.getRegistry().addGuidebookPath(RLoc.create("guide/dmnr"));
        }
    }
}