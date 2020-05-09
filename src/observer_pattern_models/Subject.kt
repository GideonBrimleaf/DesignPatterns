package observer_pattern_models

interface Subject {

    fun registerObserver(observer:Observer)
    fun removeObserver(observer:Observer)
    fun notifyObservers()
}