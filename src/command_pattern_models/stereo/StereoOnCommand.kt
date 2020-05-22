package command_pattern_models.stereo

import command_pattern_models.Command

class StereoOnCommand(private val stereo: Stereo) : Command {
    override fun execute(): String {
        return stereo.setVolume(11)
    }
}