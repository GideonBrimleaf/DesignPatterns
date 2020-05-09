package observer_pattern_models

interface Observer {
    fun update(temp:Float, humidity:Float, pressure:Float)
}