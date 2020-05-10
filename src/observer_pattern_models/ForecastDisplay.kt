package observer_pattern_models

class ForecastDisplay(
    weatherData: WeatherData
) : Observer, DisplayElement {

    init {
        weatherData.registerObserver(this)
    }

    private var currentPressure: Float = 29.5F
    private var lastPressure: Float = 0.0f

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        lastPressure = currentPressure
        currentPressure = pressure
        display()
    }

    override fun display(): String {
        val result = "Forecast: "
        return when {
            currentPressure > lastPressure -> result + "Improving weather on the way!"
            currentPressure == lastPressure -> result + "More of the same!"
            else -> result + "Watch out for cooler, wetter weather!"
        }
    }
}