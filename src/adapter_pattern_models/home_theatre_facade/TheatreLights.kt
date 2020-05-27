package adapter_pattern_models.home_theatre_facade

class TheatreLights {
    fun on():String {
        return "Switching on theatre lights"
    }

    fun off(): String {
        return "Switching off theatre lights"
    }

    fun dim():String {
        return "Dimming the lights"
    }
}