package strategy_pattern_models

class FlyNoWay:FlyBehaviour {
    override fun fly(): String {
        return "I ain't flying!"
    }
}