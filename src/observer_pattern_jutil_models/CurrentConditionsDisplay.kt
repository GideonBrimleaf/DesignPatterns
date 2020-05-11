package observer_pattern_jutil_models

import java.util.*

class CurrentConditionsDisplay(
    weatherData: Observable
) : Observer, DisplayElement {

    init{
        weatherData.addObserver(this)
    }

    private var temp:Float = 0.0f
    private var humidity:Float = 0.0f


    override fun display():String {
        return "Current conditions ${this.temp}F, and ${this.humidity}% humidity"
    }

    override fun update(o: Observable, arg: Any?) {
        if(o is WeatherData){
            val weatherData:WeatherData = o
            this.temp = weatherData.temp
            this.humidity = weatherData.humidity
            display()
        }
    }
}