package command_pattern_models.stereo

import command_pattern_models.Command

class StereoOffCommand(val stereo: Stereo) : Command {
    override fun execute(): String {
        stereo.off()
        return stereo.setVolume(0)
    }

}