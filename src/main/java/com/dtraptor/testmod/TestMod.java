package com.dtraptor.testmod;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static com.dtraptor.testmod.TestMod.MODID;

@Mod(MODID)
@Mod.EventBusSubscriber
public class TestMod {
    public static final String MODID = "testmod";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public TestMod() {

        LOGGER.debug("HELL.");
        final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //TODO make registry registry (strange, I know)
    }
}
