package de.joh.fnc.networking.packet;

import de.joh.fnc.client.event.ClientEventHandler;
import de.joh.fnc.common.item.DebugOrbSpellAdjustmentItem;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;
/**
 * Package that sends the Mouse Scroll from the Client to the Sever to Select the spell on the Debug Rod
 * @see ClientEventHandler
 * @see DebugOrbSpellAdjustmentItem
 * @author Joh0210
 */
public class IncrementSelectedSpellAdjustmentC2SPacket {
    private final boolean inverted;

    public IncrementSelectedSpellAdjustmentC2SPacket(boolean inverted){
        this.inverted = inverted;
    }

    public IncrementSelectedSpellAdjustmentC2SPacket(FriendlyByteBuf buf){
        this.inverted = buf.readBoolean();
    }

    public void toBytes(FriendlyByteBuf buf){
        buf.writeBoolean(inverted);
    }

    /**
     * Processing of the event on the SERVER SIDE!
     */
    public boolean handle(Supplier<NetworkEvent.Context> supplier){
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(()->{
            ServerPlayer player = context.getSender();
            if(player != null && player.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof DebugOrbSpellAdjustmentItem debugRod){
                debugRod.incrementSpellAdjustmentIterator(player.getItemBySlot(EquipmentSlot.MAINHAND), inverted, player);
            }
        });
        return true;
    }
}
