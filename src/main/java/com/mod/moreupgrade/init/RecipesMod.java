package com.mod.moreupgrade.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipesMod
{
    public static void init()
    {
        
    }
    
    
    public static void register()
    {
        //REcipe
      //Axe  
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_axe_t1, 1), new Object[] {"#F", "F#", '#', Items.wooden_axe, 'F', Blocks.stone});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_axe_t2, 1), new Object[] {"#F", "F#", '#', Items.wooden_axe, 'F', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_axe_t3, 1), new Object[] {"#F", "F#", '#', Items.wooden_axe, 'F', Items.redstone});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_axe_t4, 1), new Object[] {"#F", "F#", '#', Items.wooden_axe, 'F', Items.diamond});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_axe_t5, 1), new Object[] {"#F", "F#", '#', Items.wooden_axe, 'F', Items.emerald});
        
      //Sword
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_sword_t1, 1), new Object[] {"#F", "F#", '#', Items.wooden_sword, 'F', Blocks.stone});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_sword_t2, 1), new Object[] {"#F", "F#", '#', Items.wooden_sword, 'F', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_sword_t3, 1), new Object[] {"#F", "F#", '#', Items.wooden_sword, 'F', Items.redstone});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_sword_t4, 1), new Object[] {"#F", "F#", '#', Items.wooden_sword, 'F', Items.diamond});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_sword_t5, 1), new Object[] {"#F", "F#", '#', Items.wooden_sword, 'F', Items.emerald});
        
      //Pickaxe
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_pickaxe_t1, 1), new Object[] {"#F", "F#", '#', Items.wooden_pickaxe, 'F', Blocks.stone});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_pickaxe_t2, 1), new Object[] {"#F", "F#", '#', Items.wooden_pickaxe, 'F', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_pickaxe_t3, 1), new Object[] {"#F", "F#", '#', Items.wooden_pickaxe, 'F', Items.redstone});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_pickaxe_t4, 1), new Object[] {"#F", "F#", '#', Items.wooden_pickaxe, 'F', Items.diamond});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_pickaxe_t5, 1), new Object[] {"#F", "F#", '#', Items.wooden_pickaxe, 'F', Items.emerald});
      
      //Shovel
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_shovel_t1, 1), new Object[] {"#F", "F#", '#', Items.wooden_shovel, 'F', Blocks.stone});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_shovel_t2, 1), new Object[] {"#F", "F#", '#', Items.wooden_shovel, 'F', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_shovel_t3, 1), new Object[] {"#F", "F#", '#', Items.wooden_shovel, 'F', Items.redstone});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_shovel_t4, 1), new Object[] {"#F", "F#", '#', Items.wooden_shovel, 'F', Items.diamond});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_shovel_t5, 1), new Object[] {"#F", "F#", '#', Items.wooden_shovel, 'F', Items.emerald});
        
      //Hoe  
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_hoe_t1, 1), new Object[] {"#F", "F#", '#', Items.wooden_hoe, 'F', Blocks.stone});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_hoe_t2, 1), new Object[] {"#F", "F#", '#', Items.wooden_hoe, 'F', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_hoe_t3, 1), new Object[] {"#F", "F#", '#', Items.wooden_hoe, 'F', Items.redstone});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_hoe_t4, 1), new Object[] {"#F", "F#", '#', Items.wooden_hoe, 'F', Items.diamond});
        GameRegistry.addRecipe(new ItemStack(ItemMod.wood_hoe_t5, 1), new Object[] {"#F", "F#", '#', Items.wooden_hoe, 'F', Items.emerald});
        
        //Smelt
        
        
    }
}
