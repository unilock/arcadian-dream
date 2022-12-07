package net.reimaden.arcadiandream.compat.emi;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.util.Identifier;
import net.reimaden.arcadiandream.ArcadianDream;
import net.reimaden.arcadiandream.block.ModBlocks;
import net.reimaden.arcadiandream.recipe.RitualCraftingRecipe;

public class EMIPlugin implements EmiPlugin {

    public static final Identifier ID = new Identifier(ArcadianDream.MOD_ID, "ritual_crafting");
    public static final EmiStack WORKSTATION = EmiStack.of(ModBlocks.RITUAL_SHRINE);
    public static final EmiRecipeCategory RITUAL_CRAFTING_CATEGORY = new EmiRecipeCategory(ID, WORKSTATION);

    @Override
    public void register(EmiRegistry registry) {
        registry.addCategory(RITUAL_CRAFTING_CATEGORY);

        registry.addWorkstation(RITUAL_CRAFTING_CATEGORY, WORKSTATION);

        RecipeManager rm = registry.getRecipeManager();
        for (RitualCraftingRecipe recipe : rm.listAllOfType(RitualCraftingRecipe.Type.INSTANCE)) {
            registry.addRecipe(new EMIRitualCraftingRecipe(recipe));
        }
    }
}
