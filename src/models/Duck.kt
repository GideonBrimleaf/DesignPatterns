package models

abstract class Duck(
    private var name: String,
    private var flyBehaviour: FlyBehaviour,
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