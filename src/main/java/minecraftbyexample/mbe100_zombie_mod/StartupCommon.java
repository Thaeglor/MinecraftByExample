package minecraftbyexample.mbe100_zombie_mod;

import minecraftbyexample.mbe21_tileentityspecialrenderer.BlockMBE21;
import minecraftbyexample.mbe21_tileentityspecialrenderer.TileEntityMBE21;
import minecraftbyexample.mbe35_recipes.FurnaceFuelBurnTimeEventHandler;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost
 * Date: 24/12/2014
 *
 * The Startup classes for this example are called during startup, in the following order:
 *  preInitCommon
 *  preInitClientOnly
 *  initCommon
 *  initClientOnly
 *  postInitCommon
 *  postInitClientOnly
 *  See MinecraftByExample class for more information
 */
public class StartupCommon
{

  public static void preInitCommon()
  {
  }

  public static void initCommon()
  {
    MinecraftForge.EVENT_BUS.register(ZombieHurtsVillagerEventHandler.instance);
  }

  public static void postInitCommon()
  {
  }

}
