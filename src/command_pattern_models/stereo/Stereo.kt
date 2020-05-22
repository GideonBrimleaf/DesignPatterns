package command_pattern_models.stereo

class Stereo {
    private var volume:Int = 0

    fun on(): String {
        volume = 5
        return "Feel the gentle hum of glory"
    }

    fun off(): String {
        volume = 0
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

    fun setVolume(level:Int): String {
        volume += level
        return "Stereo at $volume!"
    }
}