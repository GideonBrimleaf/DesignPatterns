package strategy_pattern_models.duck_sim

class ModelDuck(name:String) : Duck(name, FlyNoWay(), Quack()) {
    override fun display(): String {
        return "Doesn't look anywhere near as good as the rubber duck but fast AF"
    }
}