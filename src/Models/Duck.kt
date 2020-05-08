package Models

abstract class Duck(var name:String) {

    fun quack():String {
        return "quacking"
    }

    fun swim():String {
        return "swimming"
}

    fun fly(): String {
        return "flying"
    }

    abstract fun display():String

}