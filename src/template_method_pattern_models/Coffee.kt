package template_method_pattern_models

class Coffee(wantsCondiments: Boolean = true) : CaffeineBeverage(wantsCondiments) {

    override fun brew(): String {
        return "Dripping coffee through filter"
    }

    override fun addCondiments(): String {
        return "Adding sugar and milk"
    }
}