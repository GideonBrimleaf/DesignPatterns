package decorator_pattern_models.starbuzz_coffee

import decorator_pattern_models.starbuzz_coffee.Beverage

class Decaf : Beverage() {

    override val description = "Decaf"

    override fun cost(): Double {
        return 1.05
    }
}