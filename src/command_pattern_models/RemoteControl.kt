package command_pattern_models

class RemoteControl {
    var onCommands = mutableListOf<Command>()
    var offCommands = mutableListOf<Command>()
    var slot: Command = NoCommand()
    private var undoCommand : Command = NoCommand()

    fun onButtonPushed(slotNumber:Int):String{
        undoCommand = onCommands[slotNumber-1]
        return onCommands[slotNumber-1].execute()
    }

    fun offButtonPush(slotNumber: Int):String{
        undoCommand = offCommands[slotNumber-1]
        return offCommands[slotNumber-1].execute()
    }

    fun undoButtonPush():String {
        return undoCommand.undo()
    }

    fun smashThatButton():String{
        return slot.execute()
    }
}