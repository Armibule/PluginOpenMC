package fr.communaywen.core.guideline.advancements.dream.trees;

import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import dev.lone.itemsadder.api.CustomStack;
import org.jetbrains.annotations.NotNull;

public class PlankAdvDream extends BaseAdvancement {
    public PlankAdvDream(@NotNull Advancement parent) {
        super(
                "planks",
                new AdvancementDisplay(
                        CustomStack.getInstance("aywen:dream_planks").getItemStack(),
                        "Voler",
                        AdvancementFrameType.TASK,
                        true,
                        false,
                        3F,5.5F,
                        "J'ai plus d'idée de description aidez moi svp"
                ),
                parent
        );
    }
}
