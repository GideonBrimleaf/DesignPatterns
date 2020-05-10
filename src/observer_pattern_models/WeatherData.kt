package observer_pattern_models

class WeatherData() : Subject {

    private var observers: MutableList<Observer> = mutableListOf()
    var temp: Float = 0.0f
        private set
    var humidity: Float = 0.0f
        private set
    var pressure: Float = 0.0f
        private set

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