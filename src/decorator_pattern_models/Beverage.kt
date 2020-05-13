package decorator_pattern_models

abstract class Beverage {
    open var description = "Unknown Beverage"

    abstract fun cost():Double
}