package observer_pattern_models

class WeatherData(
    private val observers:MutableList<Observer>,
    private var temp:Float,
    private var humidity:Float,
    private var pressure:Float
) : Subject {

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach{it.update(temp, humidity, pressure)}
    }

    private fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temp:Float, humidity: Float, pressure: Float){
        this.temp = temp
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}