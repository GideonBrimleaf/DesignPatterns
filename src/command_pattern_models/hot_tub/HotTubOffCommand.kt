package command_pattern_models.hot_tub

import command_pattern_models.Command

class HotTubOffCommand(private val hotTub: HotTub) : Command {
    override fun execute(): String {
        return hotTub.jetsOff()
    }

    override fun undo(): String {
        return hotTub.jetsOn()
    }
}