package command_pattern_models

class RemoteControl {
    lateinit var slot: Command

    fun smashThatButton():String{
        return slot.execute()
    }
}