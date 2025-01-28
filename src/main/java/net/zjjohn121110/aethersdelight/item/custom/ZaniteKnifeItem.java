package net.zjjohn121110.aethersdelight.item.custom;

import com.aetherteam.aether.item.combat.AetherItemTiers;
import com.aetherteam.aether.item.combat.abilities.weapon.ZaniteWeapon;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.neoforged.neoforge.event.ItemAttributeModifierEvent;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class ZaniteKnifeItem extends KnifeItem implements ZaniteWeapon {
    public ZaniteKnifeItem() {
        super(AetherItemTiers.ZANITE, new Properties().attributes(KnifeItem.createAttributes(AetherItemTiers.ZANITE, 0.5F, -2.0F)));
    }

    public static void onModifyAttributes(ItemAttributeModifierEvent event) {
        ItemAttributeModifiers modifiers = event.getDefaultModifiers();
        ItemStack itemStack = event.getItemStack();
        if (itemStack.getItem() instanceof ZaniteWeapon zaniteWeapon) {
            ItemAttributeModifiers.Entry attributeEntry = zaniteWeapon.increaseDamage(modifiers, itemStack);
            event.replaceModifier(attributeEntry.attribute(), attributeEntry.modifier(), attributeEntry.slot());
        }
    }
}
