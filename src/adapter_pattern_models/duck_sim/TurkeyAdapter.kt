package adapter_pattern_models.duck_sim

class TurkeyAdapter(val turkey: Turkey) : Duck {
    override fun quack(): String {
        return turkey.gobble()
    }

    override fun fly(): String {
        var result:String = ""
        repeat(5) {
            result += turkey.waddle()
        }
        return result.trimEnd()
    }
}