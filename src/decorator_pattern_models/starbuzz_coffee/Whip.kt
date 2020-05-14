package decorator_pattern_models.starbuzz_coffee

import decorator_pattern_models.starbuzz_coffee.Beverage
import decorator_pattern_models.starbuzz_coffee.CondimentDecorator

class Whip(beverage: Beverage) : CondimentDecorator(beverage) {

    override val description = beverage.description + ", Whip"

    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}