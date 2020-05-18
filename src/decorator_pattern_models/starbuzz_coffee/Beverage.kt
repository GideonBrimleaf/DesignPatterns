package decorator_pattern_models.starbuzz_coffee

abstract class Beverage(val size:Size = Size.REGULAR) {
    abstract val description:String

    abstract fun cost():Double
}