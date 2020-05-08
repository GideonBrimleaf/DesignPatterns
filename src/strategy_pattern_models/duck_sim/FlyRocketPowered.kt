package strategy_pattern_models.duck_sim

import strategy_pattern_models.duck_sim.FlyBehaviour

class FlyRocketPowered : FlyBehaviour {
    override fun fly(): String {
        return "I fly FAST AF!"
    }
}