package Models

class RubberDuck(name:String):Duck(name = name) {
    override fun display(): String {
        return "Looks like a toy"
    }


}