package voidy.llama.mud;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class mudfood {
    public static final FoodComponent crack = (new FoodComponent.Builder()).hunger(-2).saturationModifier(.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 1), 1f).snack().build();

    public static final FoodComponent dried_mud = (new FoodComponent.Builder()).hunger(5).saturationModifier(.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300, 2), 0.3f).snack().build();
}
