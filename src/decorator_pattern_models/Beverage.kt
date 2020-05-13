package decorator_pattern_models

abstract class Beverage {
    open val description = "Unknown Beverage"

    abstract fun cost():Double
}