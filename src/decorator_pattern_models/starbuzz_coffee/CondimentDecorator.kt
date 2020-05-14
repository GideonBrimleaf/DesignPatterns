package decorator_pattern_models.starbuzz_coffee

import decorator_pattern_models.starbuzz_coffee.Beverage

abstract class CondimentDecorator(val beverage: Beverage) : Beverage()