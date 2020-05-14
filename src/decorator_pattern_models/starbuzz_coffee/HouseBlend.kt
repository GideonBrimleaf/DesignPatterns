package decorator_pattern_models.starbuzz_coffee

import decorator_pattern_models.starbuzz_coffee.Beverage

class HouseBlend : Beverage() {

    override val description = "House Blend Coffee"

    override fun cost(): Double {
        return .89
    }
}