package adapter_pattern_models.home_theatre_facade

class Amplifier(var tuner:Tuner, var dvd:DvdPlayer, var cd:CdPlayer) {
    fun on():String {
        return "Amp is on!"
    }

    fun off():String {
        return "Amp is off!"
    }

    fun setStereoSound(volume:Int):String {
        return "Stereo volume at $volume"
    }

    fun setSurroundSound(volume:Int):String {
        return "Surround sound volume at $volume"
    }

}