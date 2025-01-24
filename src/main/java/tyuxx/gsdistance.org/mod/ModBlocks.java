package tyuxx.gsdistance.org.mod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static tyuxx.gsdistance.org.Grimms.MODID;

public class ModBlocks {
    public static final DeferredRegister.Blocks DEFERRED_REGISTER = DeferredRegister.createBlocks(MODID);
    public static void register(IEventBus eventBus){
        DEFERRED_REGISTER.register(eventBus);
    }
}
