package decorator_pattern_models

class Mocha(beverage: Beverage) : CondimentDecorator(beverage) {

    override val description = beverage.description + ", Mocha"

    override fun cost(): Double {
        return .20 + beverage.cost()
    }
}