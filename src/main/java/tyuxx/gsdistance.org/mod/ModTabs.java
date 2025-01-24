package tyuxx.gsdistance.org.mod;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static tyuxx.gsdistance.org.Grimms.MODID;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> DEFERRED_REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,MODID);
    public static void register(IEventBus eventBus){
        DEFERRED_REGISTER.register(eventBus);
    }
}
