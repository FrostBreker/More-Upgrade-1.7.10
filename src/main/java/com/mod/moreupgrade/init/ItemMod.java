package com.mod.moreupgrade.init;

import com.mod.moreupgrade.ModMoreUpgrade;
import com.mod.moreupgrade.Reference;
import com.mod.moreupgrade.items.ItemWoodAxeT1;
import com.mod.moreupgrade.items.ItemWoodAxeT2;
import com.mod.moreupgrade.items.ItemWoodAxeT3;
import com.mod.moreupgrade.items.ItemWoodAxeT4;
import com.mod.moreupgrade.items.ItemWoodAxeT5;
import com.mod.moreupgrade.items.ItemWoodHoeT1;
import com.mod.moreupgrade.items.ItemWoodHoeT2;
import com.mod.moreupgrade.items.ItemWoodHoeT3;
import com.mod.moreupgrade.items.ItemWoodHoeT4;
import com.mod.moreupgrade.items.ItemWoodHoeT5;
import com.mod.moreupgrade.items.ItemWoodPickaxeT1;
import com.mod.moreupgrade.items.ItemWoodPickaxeT2;
import com.mod.moreupgrade.items.ItemWoodPickaxeT3;
import com.mod.moreupgrade.items.ItemWoodPickaxeT4;
import com.mod.moreupgrade.items.ItemWoodPickaxeT5;
import com.mod.moreupgrade.items.ItemWoodShovelT1;
import com.mod.moreupgrade.items.ItemWoodShovelT2;
import com.mod.moreupgrade.items.ItemWoodShovelT3;
import com.mod.moreupgrade.items.ItemWoodShovelT4;
import com.mod.moreupgrade.items.ItemWoodShovelT5;
import com.mod.moreupgrade.items.ItemWoodSwordT1;
import com.mod.moreupgrade.items.ItemWoodSwordT2;
import com.mod.moreupgrade.items.ItemWoodSwordT3;
import com.mod.moreupgrade.items.ItemWoodSwordT4;
import com.mod.moreupgrade.items.ItemWoodSwordT5;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMod
{
    //RegMaterial
//Sword
    public static ToolMaterial toolWoodSword1 = EnumHelper.addToolMaterial("toolWoodSword1", 4, 119, 3, 3, 30);
    public static ToolMaterial toolWoodSword2 = EnumHelper.addToolMaterial("toolWoodSword2", 4, 170, 4, 4, 30);
    public static ToolMaterial toolWoodSword3 = EnumHelper.addToolMaterial("toolWoodSword3", 4, 270, 5, 5, 30);
    public static ToolMaterial toolWoodSword4 = EnumHelper.addToolMaterial("toolWoodSword4", 4, 350, 5, 6, 30);
    public static ToolMaterial toolWoodSword5 = EnumHelper.addToolMaterial("toolWoodSword5", 4, 500, 5, 6, 30);
    
//Pickaxe    
    public static ToolMaterial toolWoodPickkaxe1 = EnumHelper.addToolMaterial("toolWoodPickaxe1", 4, 119, 4, 3, 30);
    public static ToolMaterial toolWoodPickaxe2 = EnumHelper.addToolMaterial("toolWoodPickaxe2", 4, 170, 5, 4, 30);
    public static ToolMaterial toolWoodPickaxe3 = EnumHelper.addToolMaterial("toolWoodPickaxe3", 4, 270, 6, 5, 30);
    public static ToolMaterial toolWoodPickaxe4 = EnumHelper.addToolMaterial("toolWoodPickaxe4", 4, 350, 6, 6, 30);
    public static ToolMaterial toolWoodPickaxe5 = EnumHelper.addToolMaterial("toolWoodPickaxe5", 4, 500, 6, 6, 30);
    
//Axe    
    public static ToolMaterial toolWood1 = EnumHelper.addToolMaterial("toolWood1", 4, 119, 3, 1, 30);
    public static ToolMaterial toolWood2 = EnumHelper.addToolMaterial("toolWood2", 4, 170, 4, 2, 30);
    public static ToolMaterial toolWood3 = EnumHelper.addToolMaterial("toolWood3", 4, 270, 5, 3, 30);
    public static ToolMaterial toolWood4 = EnumHelper.addToolMaterial("toolWood4", 4, 350, 5, 3, 30);
    public static ToolMaterial toolWood5 = EnumHelper.addToolMaterial("toolWood5", 4, 500, 5, 3, 30);
   
//Shovel
    public static ToolMaterial toolWoodShovel1 = EnumHelper.addToolMaterial("toolWoodShovel1", 4, 119, 3, 3, 30);
    public static ToolMaterial toolWoodShovel2 = EnumHelper.addToolMaterial("toolWoodShovel2", 4, 170, 4, 4, 30);
    public static ToolMaterial toolWoodShovel3 = EnumHelper.addToolMaterial("toolWoodShovel3", 4, 270, 5, 5, 30);
    public static ToolMaterial toolWoodShovel4 = EnumHelper.addToolMaterial("toolWoodShovel4", 4, 350, 5, 6, 30);
    public static ToolMaterial toolWoodShovel5 = EnumHelper.addToolMaterial("toolWoodShovel5", 4, 500, 5, 6, 30);

//Hoe
    public static ToolMaterial toolWoodHoe1 = EnumHelper.addToolMaterial("toolWoodHoe1", 4, 119, 3, 3, 30);
    public static ToolMaterial toolWoodHoe2 = EnumHelper.addToolMaterial("toolWoodHoe2", 4, 170, 4, 4, 30);
    public static ToolMaterial toolWoodHoe3 = EnumHelper.addToolMaterial("toolWoodHoe3", 4, 270, 5, 5, 30);
    public static ToolMaterial toolWoodHoe4 = EnumHelper.addToolMaterial("toolWoodHoe4", 4, 350, 5, 6, 30);
    public static ToolMaterial toolWoodHoe5 = EnumHelper.addToolMaterial("toolWoodHoe5", 4, 500, 5, 6, 30);
    
    
    //RegItem
//Sword    
    public static Item wood_sword_t1, wood_sword_t2, wood_sword_t3, wood_sword_t4, wood_sword_t5;
    
//Pickaxe
    public static Item wood_pickaxe_t1, wood_pickaxe_t2, wood_pickaxe_t3, wood_pickaxe_t4, wood_pickaxe_t5;
    
    
//Axe    
    public static Item wood_axe_t1, wood_axe_t2, wood_axe_t3, wood_axe_t4, wood_axe_t5;
    
    
//Shovel
    public static Item wood_shovel_t1, wood_shovel_t2, wood_shovel_t3, wood_shovel_t4, wood_shovel_t5;
    
    
//Hoe   
    public static Item wood_hoe_t1, wood_hoe_t2, wood_hoe_t3, wood_hoe_t4, wood_hoe_t5;
    
    
    
    public static void init()
    {
//Sword      
        wood_sword_t1 = new ItemWoodSwordT1(toolWoodSword1).setUnlocalizedName("wood_sword_t1").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_sword_t1");
        wood_sword_t2 = new ItemWoodSwordT2(toolWoodSword2).setUnlocalizedName("wood_sword_t2").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_sword_t2");
        wood_sword_t3 = new ItemWoodSwordT3(toolWoodSword3).setUnlocalizedName("wood_sword_t3").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_sword_t3");
        wood_sword_t4 = new ItemWoodSwordT4(toolWoodSword4).setUnlocalizedName("wood_sword_t4").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_sword_t4");
        wood_sword_t5 = new ItemWoodSwordT5(toolWoodSword5).setUnlocalizedName("wood_sword_t5").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_sword_t5");
        
//Pickaxe        
        wood_pickaxe_t1 = new ItemWoodPickaxeT1(toolWood1).setUnlocalizedName("wood_pickaxe_t1").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_pickaxe_t1");
        wood_pickaxe_t2 = new ItemWoodPickaxeT2(toolWood2).setUnlocalizedName("wood_pickaxe_t2").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_pickaxe_t2");
        wood_pickaxe_t3 = new ItemWoodPickaxeT3(toolWood3).setUnlocalizedName("wood_pickaxe_t3").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_pickaxe_t3");
        wood_pickaxe_t4 = new ItemWoodPickaxeT4(toolWood4).setUnlocalizedName("wood_pickaxe_t4").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_pickaxe_t4");
        wood_pickaxe_t5 = new ItemWoodPickaxeT5(toolWood5).setUnlocalizedName("wood_pickaxe_t5").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_pickaxe_t5");
        
//Axe        
        wood_axe_t1 = new ItemWoodAxeT1(toolWood1).setUnlocalizedName("wood_axe_t1").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_axe_t1");
        wood_axe_t2 = new ItemWoodAxeT2(toolWood2).setUnlocalizedName("wood_axe_t2").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_axe_t2");
        wood_axe_t3 = new ItemWoodAxeT3(toolWood3).setUnlocalizedName("wood_axe_t3").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_axe_t3");
        wood_axe_t4 = new ItemWoodAxeT4(toolWood4).setUnlocalizedName("wood_axe_t4").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_axe_t4");
        wood_axe_t5 = new ItemWoodAxeT5(toolWood5).setUnlocalizedName("wood_axe_t5").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_axe_t5");
        
//Hoe
        wood_hoe_t1 = new ItemWoodHoeT1(toolWood1).setUnlocalizedName("wood_hoe_t1").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_hoe_t1");
        wood_hoe_t2 = new ItemWoodHoeT2(toolWood2).setUnlocalizedName("wood_hoe_t2").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_hoe_t2");
        wood_hoe_t3 = new ItemWoodHoeT3(toolWood3).setUnlocalizedName("wood_hoe_t3").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_hoe_t3");
        wood_hoe_t4 = new ItemWoodHoeT4(toolWood4).setUnlocalizedName("wood_hoe_t4").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_hoe_t4");
        wood_hoe_t5 = new ItemWoodHoeT5(toolWood5).setUnlocalizedName("wood_hoe_t5").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_hoe_t5");
        
//Shovel     
        wood_shovel_t1 = new ItemWoodShovelT1(toolWood1).setUnlocalizedName("wood_shovel_t1").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_shovel_t1");
        wood_shovel_t2 = new ItemWoodShovelT2(toolWood2).setUnlocalizedName("wood_shovel_t2").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_shovel_t2");
        wood_shovel_t3 = new ItemWoodShovelT3(toolWood3).setUnlocalizedName("wood_shovel_t3").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_shovel_t3");
        wood_shovel_t4 = new ItemWoodShovelT4(toolWood4).setUnlocalizedName("wood_shovel_t4").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_shovel_t4");
        wood_shovel_t5 = new ItemWoodShovelT5(toolWood5).setUnlocalizedName("wood_shovel_t5").setCreativeTab(ModMoreUpgrade.tabMoreUpgrade).setTextureName(Reference.MOD_ID + ":wooden_shovel_t5");
        
    }
    
    
    public static void register()
    {
     
        //Sword
        GameRegistry.registerItem(wood_sword_t1, "wood_sword_t1");
        GameRegistry.registerItem(wood_sword_t2, "wood_sword_t2");
        GameRegistry.registerItem(wood_sword_t3, "wood_sword_t3");
        GameRegistry.registerItem(wood_sword_t4, "wood_sword_t4");
        GameRegistry.registerItem(wood_sword_t5, "wood_sword_t5");
       
       //Pickaxe 
        GameRegistry.registerItem(wood_pickaxe_t1, "wood_pickaxe_t1");
        GameRegistry.registerItem(wood_pickaxe_t2, "wood_pickaxe_t2");
        GameRegistry.registerItem(wood_pickaxe_t3, "wood_pickaxe_t3");
        GameRegistry.registerItem(wood_pickaxe_t4, "wood_pickaxe_t4");
        GameRegistry.registerItem(wood_pickaxe_t5, "wood_pickaxe_t5");
        
        //Axe   
        GameRegistry.registerItem(wood_axe_t1, "wood_axe_t1");
        GameRegistry.registerItem(wood_axe_t2, "wood_axe_t2");
        GameRegistry.registerItem(wood_axe_t3, "wood_axe_t3");
        GameRegistry.registerItem(wood_axe_t4, "wood_axe_t4");
        GameRegistry.registerItem(wood_axe_t5, "wood_axe_t5");
        
        //Shovel 
        GameRegistry.registerItem(wood_shovel_t1, "wood_shovel_t1");
        GameRegistry.registerItem(wood_shovel_t2, "wood_shovel_t2");
        GameRegistry.registerItem(wood_shovel_t3, "wood_shovel_t3");
        GameRegistry.registerItem(wood_shovel_t4, "wood_shovel_t4");
        GameRegistry.registerItem(wood_shovel_t5, "wood_shovel_t5");
        
        //Hoe
        GameRegistry.registerItem(wood_hoe_t1, "wood_hoe_t1");
        GameRegistry.registerItem(wood_hoe_t2, "wood_hoe_t2");
        GameRegistry.registerItem(wood_hoe_t3, "wood_hoe_t3");
        GameRegistry.registerItem(wood_hoe_t4, "wood_hoe_t4");
        GameRegistry.registerItem(wood_hoe_t5, "wood_hoe_t5");
    }
}
