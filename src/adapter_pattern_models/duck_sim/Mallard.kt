package adapter_pattern_models.duck_sim

import adapter_pattern_models.duck_sim.Duck

class Mallard : Duck {
    override fun quack(): String {
        return "Mallard Quacking!"
    }

    override fun fly(): String {
        return "Mallard Flying"
    }
}