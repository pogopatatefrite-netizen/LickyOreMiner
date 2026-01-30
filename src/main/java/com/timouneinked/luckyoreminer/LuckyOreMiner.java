package com.timouneinked.luckyoreminer;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.hypixel.hytale.server.core.util.Config;

import javax.annotation.Nonnull;

public class LuckyOreMiner extends JavaPlugin {

    private static final String CONFIG_NAME = "LuckyOreMiner";
    private final Config<LMConfig> config;

    public LuckyOreMiner(@Nonnull JavaPluginInit init) {
        super(init);
        this.config = this.withConfig(CONFIG_NAME, LMConfig.CODEC);
    }

    @Override
    protected void setup() {
        super.setup();

        // Crée/écrit le config si absent
        this.config.save();

        // Enregistre le system ECS
        this.getEntityStoreRegistry().registerSystem(new BreakBlockEventSystem(this, config));
    }
}
