package strategy_pattern_models.duck_sim

class Quack: QuackBehaviour {
    override fun quack(): String {
        return "quacking"
    }
}