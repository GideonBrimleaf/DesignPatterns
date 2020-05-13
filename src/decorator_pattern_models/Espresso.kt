package decorator_pattern_models

class Espresso() : Beverage() {
    override val description = "Espresso"

    override fun cost():Double {
        return 1.99
    }
}