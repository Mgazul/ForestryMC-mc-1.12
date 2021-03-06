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
package forestry.factory.blocks;

import forestry.core.blocks.BlockRegistry;
import forestry.core.items.ItemBlockForestry;
import forestry.core.items.ItemBlockNBT;
import forestry.factory.MachineUIDs;

public class BlockRegistryFactory extends BlockRegistry {
	public final BlockFactoryTESR bottler;
	public final BlockFactoryTESR carpenter;
	public final BlockFactoryTESR centrifuge;
	public final BlockFactoryTESR fermenter;
	public final BlockFactoryTESR moistener;
	public final BlockFactoryTESR squeezer;
	public final BlockFactoryTESR still;
	public final BlockFactoryTESR rainmaker;

	public final BlockFactoryPlain fabricator;
	public final BlockFactoryPlain raintank;

	public BlockRegistryFactory() {
		bottler = new BlockFactoryTESR(BlockTypeFactoryTesr.BOTTLER);
		registerBlock(bottler, new ItemBlockForestry<>(bottler), MachineUIDs.BOTTLER);

		carpenter = new BlockFactoryTESR(BlockTypeFactoryTesr.CARPENTER);
		registerBlock(carpenter, new ItemBlockForestry<>(carpenter), MachineUIDs.CARPENTER);

		centrifuge = new BlockFactoryTESR(BlockTypeFactoryTesr.CENTRIFUGE);
		registerBlock(centrifuge, new ItemBlockForestry<>(centrifuge), MachineUIDs.CENTRIFUGE);

		fermenter = new BlockFactoryTESR(BlockTypeFactoryTesr.FERMENTER);
		registerBlock(fermenter, new ItemBlockForestry<>(fermenter), MachineUIDs.FERMENTER);

		moistener = new BlockFactoryTESR(BlockTypeFactoryTesr.MOISTENER);
		registerBlock(moistener, new ItemBlockForestry<>(moistener), MachineUIDs.MOISTENER);

		squeezer = new BlockFactoryTESR(BlockTypeFactoryTesr.SQUEEZER);
		registerBlock(squeezer, new ItemBlockForestry<>(squeezer), MachineUIDs.SQUEEZER);

		still = new BlockFactoryTESR(BlockTypeFactoryTesr.STILL);
		registerBlock(still, new ItemBlockForestry<>(still), MachineUIDs.STILL);

		rainmaker = new BlockFactoryTESR(BlockTypeFactoryTesr.RAINMAKER);
		registerBlock(rainmaker, new ItemBlockForestry<>(rainmaker), MachineUIDs.RAINMAKER);

		fabricator = new BlockFactoryPlain(BlockTypeFactoryPlain.FABRICATOR);
		registerBlock(fabricator, new ItemBlockNBT(fabricator), MachineUIDs.FABRICATOR);

		raintank = new BlockFactoryPlain(BlockTypeFactoryPlain.RAINTANK);
		registerBlock(raintank, new ItemBlockNBT(raintank), MachineUIDs.RAINTANK);
	}
}
