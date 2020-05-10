package test.observer_pattern_tests

import observer_pattern_models.*
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class WeatherDataTest {

    private val weatherama = WeatherData()
    private val conditionsDisplay = CurrentConditionsDisplay(weatherama)
    private val statisticsDisplay = StatisticsDisplay(weatherama)
    private val forecastDisplay = ForecastDisplay(weatherama)

    @Before
    fun before(){weatherama.setMeasurements(80f,65f,30.4f)}

    @Test
    fun `Weatherrama has data`(){
        assertEquals(80f, weatherama.temp)
        assertEquals(65f, weatherama.humidity)
        assertEquals(30.4f, weatherama.pressure)
    }

    @Test
    fun `Observers respond to weatherama data`(){
        assertEquals("Current conditions 80.0F, and 65.0% humidity", conditionsDisplay.display())
        assertEquals("Forecast: Improving weather on the way!", forecastDisplay.display())
        assertEquals("Avg/Max/Min temperature = 80.0/80.0/80.0", statisticsDisplay.display())
    }

    @Test
    fun `Observers update as weatherama updates`(){
        weatherama.setMeasurements(82f, 70f, 29.2f)
        assertEquals("Current conditions 82.0F, and 70.0% humidity", conditionsDisplay.display())
        assertEquals("Forecast: Watch out for cooler, wetter weather!", forecastDisplay.display())
        assertEquals("Avg/Max/Min temperature = 81.0/82.0/80.0", statisticsDisplay.display())
    }

    @Test
    fun `Can add a heat index display`(){
        val heatey = HeatIndexDisplay(weatherama)
        weatherama.setMeasurements(80f,65f,30.4f)
        assertEquals("Heat index is 82.95535", heatey.display())
        weatherama.setMeasurements(82f, 70f, 29.2f)
        assertEquals("Heat index is 86.90124", heatey.display())
    }
}