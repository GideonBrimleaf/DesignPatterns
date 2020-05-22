package command_pattern_models.light

import command_pattern_models.Command

class LightOffCommand(private val light:Light) : Command {
    override fun execute(): String {
        return light.off()
    }

    override fun undo(): String {
        return light.on()
    }
}