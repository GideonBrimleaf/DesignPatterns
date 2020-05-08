package strategy_pattern_models

class FlyRocketPowered : FlyBehaviour {
    override fun fly(): String {
        return "I fly FAST AF!"
    }
}