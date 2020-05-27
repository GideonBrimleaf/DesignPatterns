package adapter_pattern_models.home_theatre_facade

class Tuner {
    fun on():String {
        return "Tuner on"
    }

    fun off():String {
        return "Tuner off"
    }

    fun setFrequency(frequency: String):String {
        return "Tuned to $frequency"
    }
}