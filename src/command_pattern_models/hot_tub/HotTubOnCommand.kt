package command_pattern_models.hot_tub

import command_pattern_models.Command

class HotTubOnCommand(private val hotTub: HotTub) : Command {
    override fun execute(): String {
        return hotTub.jetsOn()
    }

    override fun undo(): String {
        return hotTub.jetsOff()
    }
}