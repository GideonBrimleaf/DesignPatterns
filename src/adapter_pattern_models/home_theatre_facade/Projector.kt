package adapter_pattern_models.home_theatre_facade

class Projector {
    fun on():String {
        return "Projector on!"
    }

    fun off():String {
        return "Projector off!"
    }

    fun tvMode():String {
        return "Projector is now in tv mode"
    }

    fun wideScreenMode():String {
        return "Projector is now in wide screen mode"
    }
}