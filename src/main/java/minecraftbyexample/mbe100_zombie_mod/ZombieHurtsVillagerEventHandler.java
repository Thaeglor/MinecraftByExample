package minecraftbyexample.mbe100_zombie_mod;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
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

      if (event.getSource().getTrueSource() instanceof EntityZombie) {

        EntityZombie entityZombie = new EntityZombie(event.getEntity().getEntityWorld());
        entityZombie.setLocationAndAngles(event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, event.getEntity().rotationYaw, event.getEntity().rotationPitch);

        if (event.getEntity().hasCustomName()) {
          entityZombie.setCustomNameTag(event.getEntity().getCustomNameTag());
          entityZombie.setAlwaysRenderNameTag(event.getEntity().getAlwaysRenderNameTag());
        }

        event.getEntity().getEntityWorld().spawnEntity(entityZombie);
        event.getEntity().setDead();
      }
    }
  }
}
