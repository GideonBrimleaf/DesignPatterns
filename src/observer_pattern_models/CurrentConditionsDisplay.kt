package observer_pattern_models

class CurrentConditionsDisplay(
    private var temp: Float,
    private var humidity: Float,
    private var subject:WeatherData
) : Observer, DisplayElement {

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temp = temp
        this.humidity = humidity
        display()
    }

    override fun display():String {
        return "Current conditions ${this.temp}C, and ${this.humidity}bar"
    }
}