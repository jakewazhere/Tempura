package com.daesun.tempura;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TempuraMod.MOD_ID)
public class TempuraMod
{
    public static final String MOD_ID = "tempura";

    private static final Logger LOGGER = LogManager.getLogger(TempuraMod.class);

    public TempuraMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
