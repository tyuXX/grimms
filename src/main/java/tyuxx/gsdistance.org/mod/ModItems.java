package tyuxx.gsdistance.org.mod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import tyuxx.gsdistance.org.Grimms;

public class ModItems {
    public static final DeferredRegister.Items DEFERRED_REGISTER = DeferredRegister.createItems(Grimms.MODID);

    public static void register(IEventBus eventBus){
        DEFERRED_REGISTER.register(eventBus);
    }
}