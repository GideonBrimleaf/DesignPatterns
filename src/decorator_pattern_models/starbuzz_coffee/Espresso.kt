package decorator_pattern_models.starbuzz_coffee

class Espresso(size: Size = Size.REGULAR) : Beverage(size) {
    override val description = "${size.tidyName} Espresso"

    override fun cost():Double {
        return 1.99
    }
}