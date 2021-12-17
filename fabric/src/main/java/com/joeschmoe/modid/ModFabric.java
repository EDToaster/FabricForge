package com.joeschmoe.modid;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModFabric implements ModInitializer {
    private static final Logger logger = LogManager.getLogger(ModFabric.class);

    @Override
    public void onInitialize() {
        logger.info("Nothing to initialize here ...");
        logger.info("Seriously why are you wasting your time");
    }
}
