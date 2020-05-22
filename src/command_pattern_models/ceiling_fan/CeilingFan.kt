package command_pattern_models.ceiling_fan

class CeilingFan(private val room:String) {
    private var speed:Int = 0

    fun on():String {
        speed = 10
        return "$room speed is $speed"
    }

    fun off():String {
        speed = 0
        return "$room speed is $speed"
    }
}