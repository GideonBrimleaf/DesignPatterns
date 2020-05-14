package decorator_pattern_models

class Soy(beverage: Beverage) : CondimentDecorator(beverage) {
    override val description = beverage.description + ", Soy"

    override fun cost(): Double {
        return beverage.cost() + 0.15
    }
}