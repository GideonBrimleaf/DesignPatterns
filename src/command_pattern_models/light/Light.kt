package command_pattern_models.light

class Light(private val room:String = "Living Room") {

    fun on():String{
        return "$room Flame On!"
    }

    fun off():String{
        return "$room Flame Off!"
    }

}