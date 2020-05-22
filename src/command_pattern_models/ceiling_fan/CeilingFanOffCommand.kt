package command_pattern_models.ceiling_fan

import command_pattern_models.Command

class CeilingFanOffCommand(private val ceilingFan: CeilingFan) : Command {
    override fun execute(): String {
        return ceilingFan.off()
    }

    override fun undo(): String {
        return ceilingFan.on()
    }
}