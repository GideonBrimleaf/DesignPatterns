package strategy_pattern_models.duck_sim

import strategy_pattern_models.duck_sim.FlyBehaviour

class FlyNoWay: FlyBehaviour {
    override fun fly(): String {
        return "I ain't flying!"
    }
}