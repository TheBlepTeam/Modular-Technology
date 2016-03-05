package blep.modtech.proxy;

import blep.modtech.block.ModtechBlocks;
import blep.modtech.config.ConfigHandler;
import blep.modtech.creativetab.ModTechCreativeTabs;
import blep.modtech.item.ModtechItems;
import blep.modtech.network.ModteckPacketHandler;

import java.io.File;

/**
 * Created by Blue <boo122333@gmail.com>.
 */
public abstract class CommonProxy implements IProxy
{
    @Override
    public void registerBlocks()
    {
        ModtechBlocks.registerAll();
    }

    @Override
    public void registerItems()
    {
        ModtechItems.registerAll();
    }

    @Override
    public void registerCreativeTab()
    {
        ModTechCreativeTabs tab = new ModTechCreativeTabs();
    }

    @Override
    public void registerConfigs(File configFile)
    {
        ConfigHandler.init(configFile);
    }

    @Override
    public void registerNetwork()
    {
        ModteckPacketHandler.registerMessages();
    }

    @Override
    public void registerEntityFXStuff()
    {

    }
}
