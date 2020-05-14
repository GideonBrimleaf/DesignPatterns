package decorator_pattern_models

abstract class Beverage {
    abstract val description:String

    abstract fun cost():Double
}