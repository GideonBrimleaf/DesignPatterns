package decorator_pattern_models.starbuzz_coffee

import decorator_pattern_models.starbuzz_coffee.Beverage
import decorator_pattern_models.starbuzz_coffee.CondimentDecorator

class Soy(beverage: Beverage) : CondimentDecorator(beverage) {
    override val description = beverage.description + ", Soy"

    override fun cost(): Double {
        return beverage.cost() + 0.15
    }
}