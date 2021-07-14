import net.minecraft.block.Blocks
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext

@Suppress("UNUSED_PARAMETER")
@Mod("mod_practice") // mods.toml と一致する必要がある
class ModMain {
    init {
        FMLJavaModLoadingContext.get().modEventBus.addListener<FMLCommonSetupEvent> {
            setup(it)
        }
        MinecraftForge.EVENT_BUS.register(this)
    }

    private fun setup(event: FMLCommonSetupEvent) {
        println("DIRT BLOCK >> ${Blocks.DIRT.name}")
    }
}
