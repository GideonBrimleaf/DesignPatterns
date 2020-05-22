package command_pattern_models

class RemoteControl {
    var onCommands = mutableListOf<Command>()
    var offCommands = mutableListOf<Command>()
    lateinit var slot: Command

    fun onButtonPushed(slotNumber:Int):String{
        return onCommands[slotNumber-1].execute()
    }

    fun offButtonPush(slotNumber: Int):String{
        return offCommands[slotNumber-1].execute()
    }

    fun smashThatButton():String{
        return slot.execute()
    }
}