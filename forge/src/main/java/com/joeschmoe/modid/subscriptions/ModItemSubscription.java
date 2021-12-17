package com.joeschmoe.modid.subscriptions;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// TODO: CHANGE MODID
@Mod.EventBusSubscriber(modid = "modid", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModItemSubscription {
    private static final Logger logger = LogManager.getLogger(ModItemSubscription.class);

    @SubscribeEvent
    public static void tooltip(ItemTooltipEvent event) {
        logger.info("I'm building a tooltip!");
    }
}
