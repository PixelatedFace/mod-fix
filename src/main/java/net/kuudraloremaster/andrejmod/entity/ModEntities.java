package net.kuudraloremaster.andrejmod.entity;

import net.kuudraloremaster.andrejmod.AndrejMod;
import net.kuudraloremaster.andrejmod.entity.custom.GoonerEntity;
import net.kuudraloremaster.andrejmod.entity.custom.PexEntity;
import net.kuudraloremaster.andrejmod.entity.custom.RhinoEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AndrejMod.MOD_ID);

    public static final RegistryObject<EntityType<RhinoEntity>> RHINO =
            ENTITY_TYPES.register("rhino", () -> EntityType.Builder.of(RhinoEntity::new, MobCategory.CREATURE)
                    .sized(2.5f, 2.5f).build("rhino"));
    public static final RegistryObject<EntityType<GoonerEntity>> GOONER =
            ENTITY_TYPES.register("gooner", () -> EntityType.Builder.of(GoonerEntity::new, MobCategory.CREATURE)
                    .sized(2f, 2f).build("gooner"));
    public static final RegistryObject<EntityType<PexEntity>> PEX =
            ENTITY_TYPES.register("pex", () -> EntityType.Builder.of(PexEntity::new, MobCategory.CREATURE)
                    .sized(1f, 2f).build("pex"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
