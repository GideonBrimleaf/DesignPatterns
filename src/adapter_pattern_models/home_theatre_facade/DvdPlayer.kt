package adapter_pattern_models.home_theatre_facade

class DvdPlayer(var dvd:String, val projector: Projector) {
    fun on():String {
        return "DVD Player on"
    }

    fun off():String {
        return "DVD Player off"
    }

    fun eject():String {
        return "DVD ejected"
    }

    fun pause():String {
        return "DVD Paused"
    }

    fun play():String {
        return "Playing $dvd"
    }

    fun stop():String {
        return "$dvd stopped"
    }
}