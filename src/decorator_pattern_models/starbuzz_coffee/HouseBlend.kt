package decorator_pattern_models.starbuzz_coffee

import decorator_pattern_models.starbuzz_coffee.Beverage

class HouseBlend(size: Size = Size.REGULAR) : Beverage(size) {

    override val description = "${size.tidyName} House Blend Coffee"

    override fun cost(): Double {
        return .89
    }
}