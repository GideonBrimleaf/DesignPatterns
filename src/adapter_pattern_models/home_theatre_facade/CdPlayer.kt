package adapter_pattern_models.home_theatre_facade

class CdPlayer(private var cd:String) {

    fun on():String {
        return "CD Player on"
    }

    fun off():String {
        return "CD Player off"
    }

    fun eject():String {
        return "CD ejected"
    }

    fun pause():String {
        return "CD Paused"
    }

    fun play():String {
        return "Playing $cd"
    }

    fun stop():String {
        return "$cd stopped"
    }
}