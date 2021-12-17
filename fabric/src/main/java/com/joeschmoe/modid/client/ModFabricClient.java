package com.joeschmoe.modid.client;

import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class ModFabricClient implements ClientModInitializer {
    private static final Logger logger = LogManager.getLogger(ModFabricClient.class);

    @Override
    public void onInitializeClient() {
        logger.info("Nothing to initialize here ...");
        logger.info("Seriously why are you wasting your time");
    }
}