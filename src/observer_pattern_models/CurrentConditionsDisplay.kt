package observer_pattern_models

class CurrentConditionsDisplay(
    weatherData:WeatherData
) : Observer, DisplayElement {

    init{
        weatherData.registerObserver(this)
    }

    private var temp:Float = 0.0f
    private var humidity:Float = 0.0f

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temp = temp
        this.humidity = humidity
        display()
    }

    override fun display():String {
        return "Current conditions ${this.temp}F, and ${this.humidity}% humidity"
    }
}