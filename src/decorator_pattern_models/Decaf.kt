package decorator_pattern_models

class Decaf :Beverage() {

    override val description = "Decaf"

    override fun cost(): Double {
        return 1.05
    }
}