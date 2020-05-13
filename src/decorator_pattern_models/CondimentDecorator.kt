package decorator_pattern_models

abstract class CondimentDecorator : Beverage() {

    abstract override val description:String

}