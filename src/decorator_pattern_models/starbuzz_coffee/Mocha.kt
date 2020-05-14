package decorator_pattern_models.starbuzz_coffee

import decorator_pattern_models.starbuzz_coffee.Beverage
import decorator_pattern_models.starbuzz_coffee.CondimentDecorator

class Mocha(beverage: Beverage) : CondimentDecorator(beverage) {

    override val description = beverage.description + ", Mocha"

    override fun cost(): Double {
        return .20 + beverage.cost()
    }
}