package decorator_pattern_models.starbuzz_coffee

abstract class Beverage {
    abstract val description:String

    abstract fun cost():Double
}