package decorator_pattern_models

class Whip(beverage: Beverage) : CondimentDecorator(beverage) {

    override val description = beverage.description + ", Whip"

    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}