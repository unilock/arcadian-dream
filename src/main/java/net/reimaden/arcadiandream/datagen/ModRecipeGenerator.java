/*
 * Copyright (c) 2022 Maxmani and contributors.
 * Licensed under the EUPL-1.2 or later.
 */

package net.reimaden.arcadiandream.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.reimaden.arcadiandream.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {

    private enum MOON_PHASES {
        FULL_MOON,
        WANING_GIBBOUS,
        LAST_QUARTER,
        WANING_CRESCENT,
        NEW_MOON,
        WAXING_CRESCENT,
        FIRST_QUARTER,
        WAXING_GIBBOUS
    }

    public ModRecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    private static Identifier ritualCraftingId(Item item) {
        return new Identifier("ritual_crafting/"
                + RecipeProvider.getRecipeName(item)
                + "_from_ritual_crafting");
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        RitualCraftingRecipeJsonBuilder.create(ModItems.MAKAITE_INFUSED_NETHERITE_INGOT)
                .input(ModItems.MAKAITE_INGOT)
                .input(Items.NETHERITE_INGOT)
                .offerTo(exporter, ritualCraftingId(ModItems.MAKAITE_INFUSED_NETHERITE_INGOT));

        RitualCraftingRecipeJsonBuilder.create(ModItems.NUE_TRIDENT)
                .input(Items.TRIDENT)
                .input(ModItems.MAKAITE_INFUSED_NETHERITE_INGOT)
                .input(Items.DIAMOND)
                .input(Items.SPIDER_EYE)
                .input(Items.FIRE_CHARGE)
                .input(Items.SPIDER_EYE)
                .input(Items.DIAMOND)
                .input(ModItems.MAKAITE_INFUSED_NETHERITE_INGOT)
                .input(Items.PRISMARINE_CRYSTALS)
                .input(Items.PRISMARINE_CRYSTALS)
                .offerTo(exporter, ritualCraftingId(ModItems.NUE_TRIDENT));
    }
}