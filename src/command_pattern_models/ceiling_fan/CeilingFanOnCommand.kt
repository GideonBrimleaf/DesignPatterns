package command_pattern_models.ceiling_fan

import command_pattern_models.Command

class CeilingFanOnCommand(private val ceilingFan: CeilingFan) : Command {
    override fun execute(): String {
        return ceilingFan.on()
    }

    override fun undo(): String {
        return ceilingFan.off()
    }
}