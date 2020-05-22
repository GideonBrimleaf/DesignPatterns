package command_pattern_models.stereo

class Stereo {

    fun on(): String {
        return "Feel the gentle hum of glory"
    }

    fun off(): String {
        return "Powering down"
    }

    fun setCd(): String {
        return "Playing CD"
    }

    fun setDvd(): String {
        return "Playing DVD"
    }

    fun setRadio(): String {
        return "I heard it on my radio"
    }

    fun setVolume(volume:Int): String {
        return "Crank it up to $volume!"
    }
}