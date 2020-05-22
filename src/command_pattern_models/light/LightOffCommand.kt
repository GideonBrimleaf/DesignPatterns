package command_pattern_models.light

import command_pattern_models.Command

class LightOffCommand(val light:Light) : Command {
    override fun execute(): String {
        return light.off()
    }
}