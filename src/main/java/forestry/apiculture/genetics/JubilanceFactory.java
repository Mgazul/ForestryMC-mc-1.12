/*******************************************************************************
 * Copyright (c) 2011-2014 SirSengir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Various Contributors including, but not limited to:
 * SirSengir (original work), CovertJaguar, Player, Binnie, MysteriousAges
 ******************************************************************************/
package forestry.apiculture.genetics;

import forestry.api.apiculture.IJubilanceFactory;
import forestry.api.apiculture.IJubilanceProvider;
import net.minecraft.block.state.IBlockState;

public class JubilanceFactory implements IJubilanceFactory {
	@Override
	public IJubilanceProvider getDefault() {
		return JubilanceDefault.instance;
	}

	@Override
	public IJubilanceProvider getRequiresResource(IBlockState... acceptedBlockStates) {
		return new JubilanceRequiresResource(acceptedBlockStates);
	}
}