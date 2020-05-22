package command_pattern_models.stereo

import command_pattern_models.Command

class StereoOffCommand(private val stereo: Stereo) : Command {
    override fun execute(): String {
        return stereo.off()
    }

    override fun undo(): String {
        return stereo.on()
    }

}