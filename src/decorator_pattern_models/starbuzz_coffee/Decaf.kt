package decorator_pattern_models.starbuzz_coffee

import decorator_pattern_models.starbuzz_coffee.Beverage

class Decaf(size: Size = Size.REGULAR) : Beverage(size) {

    override val description = "${size.tidyName} Decaf"

    override fun cost(): Double {
        return 1.05
    }
}