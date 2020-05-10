package observer_pattern_models

class StatisticsDisplay(
    private var maxTemp:Float = 0.0f,
    private var minTemp:Float = 200.0f,
    private var tempSum:Float = 0.0f,
    private var numReadings:Int = 0,
    private var weatherData: WeatherData
) : Observer, DisplayElement {

    init{
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        tempSum += temp
        numReadings++
        if (temp > maxTemp) maxTemp = temp
        if (temp < minTemp) minTemp = temp
        display()
    }

    override fun display(): String {
        return "Avg/Max/Min temperature = ${tempSum/numReadings}/${maxTemp}/${minTemp}"
    }
}