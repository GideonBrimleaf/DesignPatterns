package test.observer_pattern_jutil_tests

import observer_pattern_jutil_models.*
import org.junit.Before
import org.junit.Ignore
import org.junit.Test
import kotlin.test.assertEquals

class WeatherDataTest {

    private val weatherama = WeatherData()
    private val conditionsDisplay = CurrentConditionsDisplay(weatherama)

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
    }

    @Test
    fun `Observers update as weatherama updates`(){
        weatherama.setMeasurements(82f, 70f, 29.2f)
        assertEquals("Current conditions 82.0F, and 70.0% humidity", conditionsDisplay.display())
    }
}