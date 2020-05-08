package com.mod.moreupgrade;

import com.mod.moreupgrade.init.BlockMod;
import com.mod.moreupgrade.init.ItemMod;
import com.mod.moreupgrade.init.RecipesMod;
import com.mod.moreupgrade.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class ModMoreUpgrade
{
    @Instance(Reference.MOD_ID)
    public static ModMoreUpgrade instance;
    
    private static final String clientProxy = null;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;
    
    public static CreativeTabs tabMoreUpgrade = new CreativeTabs("tabMoreUpgrade")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ItemMod.wood_axe_t1;
        }
    };
    
    
    @EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
    ItemMod.init();
    ItemMod.register();
    BlockMod.init();
    BlockMod.register();
    RecipesMod.init();
    RecipesMod.register();
  }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
        
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
