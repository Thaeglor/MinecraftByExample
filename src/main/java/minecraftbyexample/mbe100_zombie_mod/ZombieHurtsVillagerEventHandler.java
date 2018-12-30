package minecraftbyexample.mbe100_zombie_mod;

import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ZombieHurtsVillagerEventHandler {
  public static final ZombieHurtsVillagerEventHandler instance = new ZombieHurtsVillagerEventHandler();

  private ZombieHurtsVillagerEventHandler() {};

  @SubscribeEvent
  public void onLivingHurtEvent(LivingHurtEvent event)
  {
    if (event.getEntity() instanceof EntityVillager) {
      System.out.println("PENGUIN");
    }
  }
}
