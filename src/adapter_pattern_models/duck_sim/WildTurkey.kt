package adapter_pattern_models.duck_sim

import adapter_pattern_models.duck_sim.Turkey

class WildTurkey : Turkey {
    override fun gobble(): String {
        return "Wild gobble gobble!"
    }

    override fun waddle(): String {
        return "Tukeh fly! "
    }

}