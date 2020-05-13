package decorator_pattern_models

class Mocha(private val beverage: Beverage) : CondimentDecorator() {

    override val description = beverage.description + ", Mocha"

    override fun cost(): Double {
        return .20 + beverage.cost()
    }
}