package template_method_pattern_models

abstract class CaffeineBeverage(private val wantsCondiments: Boolean = true) {
    fun prepareRecipe():String {
        boilWater()
        brew()
        pourInCup()
        return if (customerWantsCondiments()){
            addCondiments()
        } else brew()
    }

    abstract fun brew():String

    abstract fun addCondiments():String

    private fun boilWater():String {
        return "Boiling the water"
    }

    private fun customerWantsCondiments(): Boolean {
        return wantsCondiments
    }

    private fun pourInCup():String {
        return "Pouring into cup"
    }
}