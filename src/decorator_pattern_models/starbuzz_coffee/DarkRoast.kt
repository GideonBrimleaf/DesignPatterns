package decorator_pattern_models.starbuzz_coffee

import decorator_pattern_models.starbuzz_coffee.Beverage

class DarkRoast : Beverage() {

    override val description = "Dark Roast"

    override fun cost(): Double {
        return .99
    }
}