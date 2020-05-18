package decorator_pattern_models.starbuzz_coffee

class Soy(beverage: Beverage) : CondimentDecorator(beverage) {
    override val description = beverage.description + ", Soy"

    override fun cost(): Double {
        return when (beverage.size) {
            Size.SMALL -> beverage.cost() + 0.1
            Size.LARGE -> beverage.cost() + 0.2
            else -> beverage.cost() + 0.15
        }
    }
}