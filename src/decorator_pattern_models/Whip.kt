package decorator_pattern_models

class Whip(val beverage: Beverage) : CondimentDecorator() {

    override val description = beverage.description + ", Whip"

    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}