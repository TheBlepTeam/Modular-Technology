package net.blep.modularTechnology.common.tech.items;

import  cpw.mods.fml.common.registry.GameRegistry;
import net.blep.modularTechnology.common.core.items.ItemDismountedTileData;
import net.blep.modularTechnology.common.core.items.ItemWrench;
import net.blep.modularTechnology.common.core.items.ModItem;
import net.blep.modularTechnology.common.tech.EnumMetalMaterial;
import net.blep.modularTechnology.common.core.ModContent;
import net.blep.modularTechnology.common.tech.items.item.ItemFineOre;
import net.blep.modularTechnology.common.tech.items.item.ItemIngot;
import net.blep.modularTechnology.common.tech.items.item.ItemLumpOre;
import net.blep.modularTechnology.common.tech.items.item.ItemNugget;
import net.blep.modularTechnology.common.tech.tabs.CreativeTabHandler;
import net.minecraft.item.Item;

/**
 * @author TheEpicTekkit
 */
public class TechItemHandler extends ModContent
{
    //----------------================ METALS ================----------------\\
    public final Item ingotAluminium = new ItemIngot(EnumMetalMaterial.ALUMINIUM);
    public final Item ingotChromium = new ItemIngot(EnumMetalMaterial.CHROMIUM);
    public final Item ingotCopper = new ItemIngot(EnumMetalMaterial.COPPER);
    public final Item ingotLead = new ItemIngot(EnumMetalMaterial.LEAD);
    public final Item ingotMagnesium = new ItemIngot(EnumMetalMaterial.MAGNESIUM);
    public final Item ingotManganese = new ItemIngot(EnumMetalMaterial.MANGANESE);
    public final Item ingotPlatinum = new ItemIngot(EnumMetalMaterial.PLATINUM);
    public final Item ingotSilver = new ItemIngot(EnumMetalMaterial.SILVER);
    public final Item ingotTin = new ItemIngot(EnumMetalMaterial.TIN);
    public final Item ingotTitanium = new ItemIngot(EnumMetalMaterial.TITANIUM);
    public final Item ingotYttrium = new ItemIngot(EnumMetalMaterial.YTTRIUM);
    public final Item ingotZinc = new ItemIngot(EnumMetalMaterial.ZINC);
    public final Item ingotZirconium = new ItemIngot(EnumMetalMaterial.ZIRCONIUM);

    //----------------================ METAL ALLOYS ================----------------\\
    public final Item ingotBronze = new ItemIngot(EnumMetalMaterial.BRONZE);
    public final Item ingotMolybdenum = new ItemIngot(EnumMetalMaterial.MOLYBDENUM);
    public final Item ingotSteel = new ItemIngot(EnumMetalMaterial.STEEL);
    public final Item ingotZhyconite = new ItemIngot(EnumMetalMaterial.ZHYCONITE);

    //----------------================ NUGGETS ================----------------\\
    public final Item nuggetAluminium = new ItemNugget(EnumMetalMaterial.ALUMINIUM);
    public final Item nuggetChromium = new ItemNugget(EnumMetalMaterial.CHROMIUM);
    public final Item nuggetCopper = new ItemNugget(EnumMetalMaterial.COPPER);
    public final Item nuggetLead = new ItemNugget(EnumMetalMaterial.LEAD);
    public final Item nuggetMagnesium = new ItemNugget(EnumMetalMaterial.MAGNESIUM);
    public final Item nuggetManganese = new ItemNugget(EnumMetalMaterial.MANGANESE);
    public final Item nuggetPlatinum = new ItemNugget(EnumMetalMaterial.PLATINUM);
    public final Item nuggetSilver = new ItemNugget(EnumMetalMaterial.SILVER);
    public final Item nuggetTin = new ItemNugget(EnumMetalMaterial.TIN);
    public final Item nuggetTitanium = new ItemNugget(EnumMetalMaterial.TITANIUM);
    public final Item nuggetYttrium = new ItemNugget(EnumMetalMaterial.YTTRIUM);
    public final Item nuggetZinc = new ItemNugget(EnumMetalMaterial.ZINC);
    public final Item nuggetZirconium = new ItemNugget(EnumMetalMaterial.ZIRCONIUM);

    //----------------================ METAL ALLOYS ================----------------\\
    public final Item nuggetBronze = new ItemNugget(EnumMetalMaterial.BRONZE);
    public final Item nuggetMolybdenum = new ItemNugget(EnumMetalMaterial.MOLYBDENUM);
    public final Item nuggetSteel = new ItemNugget(EnumMetalMaterial.STEEL);
    public final Item nuggetZhyconite = new ItemNugget(EnumMetalMaterial.ZHYCONITE);

    //----------------================ METAL LUMP ORE ================----------------\\
    public final Item lumpAluminium = new ItemLumpOre(EnumMetalMaterial.ALUMINIUM);
    public final Item lumpChromium = new ItemLumpOre(EnumMetalMaterial.CHROMIUM);
    public final Item lumpCopper = new ItemLumpOre(EnumMetalMaterial.COPPER);
    public final Item lumpLead = new ItemLumpOre(EnumMetalMaterial.LEAD);
    public final Item lumpMagnesium = new ItemLumpOre(EnumMetalMaterial.MAGNESIUM);
    public final Item lumpManganese = new ItemLumpOre(EnumMetalMaterial.MANGANESE);
    public final Item lumpPlatinum = new ItemLumpOre(EnumMetalMaterial.PLATINUM);
    public final Item lumpSilver = new ItemLumpOre(EnumMetalMaterial.SILVER);
    public final Item lumpTin = new ItemLumpOre(EnumMetalMaterial.TIN);
    public final Item lumpTitanium = new ItemLumpOre(EnumMetalMaterial.TITANIUM);
    public final Item lumpYttrium = new ItemLumpOre(EnumMetalMaterial.YTTRIUM);
    public final Item lumpZinc = new ItemLumpOre(EnumMetalMaterial.ZINC);
    public final Item lumpZirconium = new ItemLumpOre(EnumMetalMaterial.ZIRCONIUM);

    //----------------================ METAL FINE ORE ================----------------\\
    public final Item dustAluminium = new ItemFineOre(EnumMetalMaterial.ALUMINIUM);
    public final Item dustChromium = new ItemFineOre(EnumMetalMaterial.CHROMIUM);
    public final Item dustCopper = new ItemFineOre(EnumMetalMaterial.COPPER);
    public final Item dustLead = new ItemFineOre(EnumMetalMaterial.LEAD);
    public final Item dustMagnesium = new ItemFineOre(EnumMetalMaterial.MAGNESIUM);
    public final Item dustManganese = new ItemFineOre(EnumMetalMaterial.MANGANESE);
    public final Item dustPlatinum = new ItemFineOre(EnumMetalMaterial.PLATINUM);
    public final Item dustSilver = new ItemFineOre(EnumMetalMaterial.SILVER);
    public final Item dustTin = new ItemFineOre(EnumMetalMaterial.TIN);
    public final Item dustTitanium = new ItemFineOre(EnumMetalMaterial.TITANIUM);
    public final Item dustYttrium = new ItemFineOre(EnumMetalMaterial.YTTRIUM);
    public final Item dustZinc = new ItemFineOre(EnumMetalMaterial.ZINC);
    public final Item dustZirconium = new ItemFineOre(EnumMetalMaterial.ZIRCONIUM);
    public final Item dustStone = ModItem.newModItem("dustStone", CreativeTabHandler.tabMetals);


    public final Item uniWrench = new ItemWrench();
    public final Item dismountedMachine = new ItemDismountedTileData();
}