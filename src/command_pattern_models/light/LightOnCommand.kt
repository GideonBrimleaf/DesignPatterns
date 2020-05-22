package command_pattern_models.light

import command_pattern_models.Command

class LightOnCommand(private val light: Light) : Command {

    override fun execute():String {
        return light.on()
    }

    override fun undo(): String {
        return light.off()
    }
}