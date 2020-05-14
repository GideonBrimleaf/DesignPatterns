package decorator_pattern_models.starbuzz_coffee

import decorator_pattern_models.starbuzz_coffee.Beverage

class Espresso() : Beverage() {
    override val description = "Espresso"

    override fun cost():Double {
        return 1.99
    }
}