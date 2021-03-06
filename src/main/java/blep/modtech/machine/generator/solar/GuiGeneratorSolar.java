package blep.modtech.machine.generator.solar;

import blep.modtech.reference.ModInfo;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Blue <boo122333@gmail.com>.
 */
public class GuiGeneratorSolar extends GuiContainer
{
    private final ResourceLocation texture = new ResourceLocation(ModInfo.MOD_ID, "textures/gui/guiSolarGen.png");
    private final TileEntityGeneratorSolar tile;

    public GuiGeneratorSolar(InventoryPlayer inventory, TileEntityGeneratorSolar tileEntityNew)
    {
        super(new ContainerGeneratorSolar(inventory, tileEntityNew));
        tile = tileEntityNew;
        xSize = 105;
        ySize = 87;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        mc.getTextureManager().bindTexture(texture);
        int i = (width - xSize) / 2;
        int j = (height - ySize) / 2;
        drawTexturedModalRect(i, j, 0, 0, xSize, ySize);
        int percentage = (int) (52F * (1F - tile.getEnergyStored(EnumFacing.DOWN) / (float) tile.getMaxEnergyStored(EnumFacing.DOWN)));
        drawTexturedModalRect(guiLeft + 68, guiTop + 19 + percentage, 106, 19 + percentage, 16, 52 - percentage);
        drawTexturedModalRect(guiLeft + 18, guiTop + 18, tile.shouldGenerate() ? 105 : 114, 71, 8, 8);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        String s = tile.getDisplayName().getUnformattedText();
        fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        if (isPointInRegion(67, 18, 15, 50, mouseX, mouseY))
        {
            List<String> textLines = new ArrayList<>();
            textLines.add(tile.getEnergyStored(EnumFacing.DOWN) + "/" + tile.getMaxEnergyStored(EnumFacing.DOWN)+" Rf");
            drawHoveringText(textLines, mouseX - guiLeft, mouseY - guiTop);
        }
    }
}
