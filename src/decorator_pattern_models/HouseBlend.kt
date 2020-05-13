package decorator_pattern_models

class HouseBlend : Beverage() {

    override val description = "House Blend Coffee"

    override fun cost(): Double {
        return .89
    }
}