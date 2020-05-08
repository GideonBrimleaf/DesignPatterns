package strategy_pattern_models.duck_sim

import strategy_pattern_models.duck_sim.QuackBehaviour

class Squeak: QuackBehaviour {
    override fun quack(): String {
        return "Squeak!"
    }
}