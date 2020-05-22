package command_pattern_models.garage_door

import command_pattern_models.Command

class GarageDoorOpenCommand(private val garageDoor: GarageDoor) : Command {
    override fun execute(): String {
        return garageDoor.up()
    }
}