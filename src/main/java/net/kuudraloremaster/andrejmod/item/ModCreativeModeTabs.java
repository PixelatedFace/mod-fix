package net.kuudraloremaster.andrejmod.item;

import net.kuudraloremaster.andrejmod.AndrejMod;
import net.kuudraloremaster.andrejmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AndrejMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> ANDREJ_TAB = CREATIVE_MODE_TABS.register("andrej_tab",
            ()-> CreativeModeTab.builder().icon(() ->  new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.andrej_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.PIXEL.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());
                        pOutput.accept(ModItems.BOAR.get());
                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.KFC.get());
                        pOutput.accept(ModItems.RAW_KFC.get());
                        pOutput.accept(ModItems.KFC_BUCKET.get());
                        pOutput.accept(ModItems.KYS_GUN.get());
                        pOutput.accept(ModItems.PINE_CONE.get());
                        pOutput.accept(ModItems.NEVER_GOON.get());
                        pOutput.accept(ModItems.WAFFLE.get());
                        pOutput.accept(ModItems.MAGNUS.get());
                        pOutput.accept(ModItems.MAX_VERSTAPPEN.get());
                        pOutput.accept(ModItems.BALLS_CUTTER.get());
                        pOutput.accept(ModItems.DUMBBELL.get());
                        pOutput.accept(ModItems.WINDOWS.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
