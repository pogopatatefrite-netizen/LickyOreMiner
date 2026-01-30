package com.timouneinked.luckyoreminer;

import com.hypixel.hytale.codec.Codec;
import com.hypixel.hytale.codec.KeyedCodec;
import com.hypixel.hytale.codec.builder.BuilderCodec;

public class LMConfig {

    // =========================
    // CODEC (OBLIGATOIRE)
    // =========================
    public static final BuilderCodec<LMConfig> CODEC =
            BuilderCodec.builder(LMConfig.class, LMConfig::new)

                    .append(new KeyedCodec<Boolean>("EnableParticles", Codec.BOOLEAN),
                            (cfg, v, extra) -> cfg.enableParticles = v,
                            (cfg, extra) -> cfg.enableParticles)
                    .add()

                    .append(new KeyedCodec<Boolean>("EnableSound", Codec.BOOLEAN),
                            (cfg, v, extra) -> cfg.enableSound = v,
                            (cfg, extra) -> cfg.enableSound)
                    .add()

                    .append(new KeyedCodec<String>("ParticleSystemId", Codec.STRING),
                            (cfg, v, extra) -> cfg.particleSystemId = v,
                            (cfg, extra) -> cfg.particleSystemId)
                    .add()

                    .append(new KeyedCodec<String>("ParticleSystemStillId", Codec.STRING),
                            (cfg, v, extra) -> cfg.particleSystemStillId = v,
                            (cfg, extra) -> cfg.particleSystemStillId)
                    .add()

                    .append(new KeyedCodec<String>("SoundEventId", Codec.STRING),
                            (cfg, v, extra) -> cfg.soundEventId = v,
                            (cfg, extra) -> cfg.soundEventId)
                    .add()

                    .build();

    // =========================
    // CONFIG VALUES (DEFAULTS)
    // =========================
    private boolean enableParticles = true;
    private boolean enableSound = true;

    private String particleSystemId = "TimouneInked_LuckyOreMiner_Spawn";
    private String particleSystemStillId = "TimouneInked_LuckyOreMiner_Spawn_Still";

    private String soundEventId = "";

    public LMConfig() {}

    // =========================
    // GETTERS
    // =========================
    public boolean isEnableParticles() {
        return enableParticles;
    }

    public boolean isEnableSound() {
        return enableSound;
    }

    public String getParticleSystemId() {
        return particleSystemId;
    }

    public String getParticleSystemStillId() {
        return particleSystemStillId;
    }

    public String getSoundEventId() {
        return soundEventId;
    }
}
