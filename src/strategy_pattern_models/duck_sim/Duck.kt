package strategy_pattern_models.duck_sim

abstract class Duck(
    private var name: String,
    internal var flyBehaviour: FlyBehaviour,
    private var quackBehaviour: QuackBehaviour
) {

    fun swim():String {
        return "swimming"
}

    fun performFly():String {
        return flyBehaviour.fly()
    }

    fun performQuack():String{
        return quackBehaviour.quack()
    }

    abstract fun display():String

}