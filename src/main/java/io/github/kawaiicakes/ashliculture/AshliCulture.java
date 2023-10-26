package io.github.kawaiicakes.ashliculture;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(AshliCulture.MODID)
public class AshliCulture
{
    public static final String MODID = "ashliculture";
    private static final Logger LOGGER = LogUtils.getLogger();
    public AshliCulture()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
