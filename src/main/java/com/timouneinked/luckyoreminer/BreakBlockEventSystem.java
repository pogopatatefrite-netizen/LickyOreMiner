package com.timouneinked.luckyoreminer;

import com.hypixel.hytale.component.ArchetypeChunk;
import com.hypixel.hytale.component.CommandBuffer;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.component.query.Query;
import com.hypixel.hytale.component.system.EntityEventSystem;
import com.hypixel.hytale.server.core.event.events.ecs.BreakBlockEvent;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import com.hypixel.hytale.server.core.util.Config;

import javax.annotation.Nonnull;

public class BreakBlockEventSystem extends EntityEventSystem<EntityStore, BreakBlockEvent> {

    private final LuckyOreMiner plugin;
    private final Config<LMConfig> config;

    public BreakBlockEventSystem(LuckyOreMiner plugin, Config<LMConfig> config) {
        super(BreakBlockEvent.class);
        this.plugin = plugin;
        this.config = config;
    }

    @Override
    public void handle(
            int index,
            @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
            @Nonnull Store<EntityStore> store,
            @Nonnull CommandBuffer<EntityStore> commandBuffer,
            @Nonnull BreakBlockEvent event
    ) {
        // Pour l’instant : aucune logique
        // On ajoutera mining + particles après validation complète
    }

    @Override
    public Query<EntityStore> getQuery() {
        return PlayerRef.getComponentType();
    }
}
