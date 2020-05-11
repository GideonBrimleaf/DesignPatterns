package observer_pattern_jutil_models

import java.util.*

class WeatherData : Observable() {

    private var observers: MutableList<Observer> = mutableListOf()
    var temp: Float = 0.0f
        private set
    var humidity:Float = 0.0f
        private set
    var pressure:Float = 0.0f
        private set

    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    private fun measurementsChanged() {
        setChanged()
        notifyObservers()
    }

    fun setMeasurements(temp:Float, humidity: Float, pressure: Float){
        this.temp = temp
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}