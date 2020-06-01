package template_method_pattern_models

class Duck(val name:String, private val weight:Int) : Comparable<Any>{
    override fun toString(): String {
        return "$name weighs $weight"
    }

    override fun compareTo(other: Any): Int {
        val otherDuck = other as Duck?
        var comparator = 0
        if (otherDuck != null) {
            comparator = when {
                weight < otherDuck.weight -> -1
                weight == otherDuck.weight -> 0
                else -> 1
            }
        }
        return comparator
    }


}