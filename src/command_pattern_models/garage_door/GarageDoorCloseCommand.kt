package command_pattern_models.garage_door

import command_pattern_models.Command

class GarageDoorCloseCommand(val garageDoor: GarageDoor) : Command {
    override fun execute(): String {
        return garageDoor.down()
    }

    override fun undo(): String {
        return garageDoor.up()
    }
}