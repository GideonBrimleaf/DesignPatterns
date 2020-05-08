package strategy_pattern_models.duck_sim

import strategy_pattern_models.duck_sim.FlyBehaviour

class FlyWithWings: FlyBehaviour {
    override fun fly(): String {
        return "flying"
    }
}