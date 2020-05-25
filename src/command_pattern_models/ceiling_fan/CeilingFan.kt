package command_pattern_models.ceiling_fan

class CeilingFan(private val room:String) {
    val HIGH = 3
    val MEDIUM = 2
    val LOW = 1
    val OFF = 0
    var speed = OFF
        private set

    fun off():String {
        speed = OFF
        return "$room speed is $speed"
    }

    fun high():String {
        speed = HIGH
        return "$room speed is $speed"
    }

    fun medium():String {
        speed = MEDIUM
        return "$room speed is $speed"
    }

    fun low():String {
        speed = LOW
        return "$room speed is $speed"
    }


}