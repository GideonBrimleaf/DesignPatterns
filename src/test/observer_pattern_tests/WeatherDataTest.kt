package test.observer_pattern_tests

import observer_pattern_models.CurrentConditionsDisplay
import observer_pattern_models.ForecastDisplay
import observer_pattern_models.StatisticsDisplay
import observer_pattern_models.WeatherData
import org.junit.Before
import org.junit.Ignore
import org.junit.Test
import kotlin.test.assertEquals

class WeatherDataTest {

    private val weatherama = WeatherData()
    val conditionsDisplay = CurrentConditionsDisplay(weatherama)
    val statisticsDisplay = StatisticsDisplay(weatherama)
    val forecastDisplay = ForecastDisplay(weatherama)

    @Before
    fun before(){weatherama.setMeasurements(80f,65f,30.4f)}

    @Test
    fun `Observers update as the measurements are set on weatherrama`(){
        assertEquals(80f, weatherama.getTemp())

    }

    @Ignore
    @Test
    fun `Observers change response as data changes`(){

    }

}