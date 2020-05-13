package decorator_pattern_models

class DarkRoast : Beverage() {

    override val description = "Dark Roast"

    override fun cost(): Double {
        return .99
    }
}