package strategy_pattern_models.duck_sim

class Mallard(name: String): Duck(name, FlyWithWings(), Quack()) {
    override fun display(): String {
        return "Looks like a legend"
    }
}