package decorator_pattern_models.starbuzz_coffee

import decorator_pattern_models.starbuzz_coffee.Beverage

class DarkRoast (size: Size = Size.REGULAR): Beverage(size) {

    override val description = "${size.tidyName} Dark Roast"

    override fun cost(): Double {
        return .99
    }
}