package command_pattern_models.ceiling_fan

import command_pattern_models.Command

class CeilingFanHighCommand(private val ceilingFan: CeilingFan) : Command {
    private var prevSpeed = 0

    override fun execute(): String {
        prevSpeed = ceilingFan.speed
        return ceilingFan.high()
    }

    override fun undo(): String {
        return when(prevSpeed){
            ceilingFan.HIGH -> ceilingFan.high()
            ceilingFan.MEDIUM -> ceilingFan.medium()
            ceilingFan.LOW -> ceilingFan.low()
            else -> ceilingFan.off()
        }
    }
}