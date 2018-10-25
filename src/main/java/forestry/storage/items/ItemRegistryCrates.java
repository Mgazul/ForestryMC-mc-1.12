package forestry.storage.items;

import net.minecraft.item.ItemStack;

import forestry.core.items.ItemRegistry;

public class ItemRegistryCrates extends ItemRegistry {
	public final ItemCrated crate;

	public ItemRegistryCrates() {
		// CRATE
		crate = registerItem(new ItemCrated(ItemStack.EMPTY, null), "crate");
	}
}
