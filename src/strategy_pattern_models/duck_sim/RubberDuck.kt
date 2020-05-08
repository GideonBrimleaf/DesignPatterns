package strategy_pattern_models.duck_sim

class RubberDuck(name: String) : Duck(name, FlyNoWay(), Squeak()) {

    override fun display(): String {
        return "Looks like a toy"
    }
}