package template_method_pattern_models

class Tea : CaffeineBeverage() {

    override fun brew():String {
        return "Steeping the tea"
    }

    override fun addCondiments():String {
        return "Adding lemons"
    }
}