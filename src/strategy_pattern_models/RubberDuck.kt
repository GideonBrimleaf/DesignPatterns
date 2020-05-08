package strategy_pattern_models

class RubberDuck(name: String) : Duck(name, FlyNoWay(), Squeak()) {

    override fun display(): String {
        return "Looks like a toy"
    }
}