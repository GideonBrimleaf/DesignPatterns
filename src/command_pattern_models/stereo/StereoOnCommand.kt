package command_pattern_models.stereo

import command_pattern_models.Command

class StereoOnCommand(private val stereo: Stereo) : Command {
    override fun execute(): String {
        return stereo.on()
    }

    override fun undo(): String {
        return stereo.off()
    }
}