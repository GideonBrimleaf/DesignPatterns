package test.adapter_pattern_test

import adapter_pattern_models.home_theatre_facade.*
import org.junit.Test
import kotlin.test.assertEquals

class HomeTheatreFacadeTest {

    @Test
    fun `Doing a home theatre`() {
        val cdPlayer = CdPlayer("Goo Goo Dolls")
        val projector = Projector()
        val dvdPlayer = DvdPlayer("Indiana Jones", projector)
        val tuner = Tuner()
        val amp = Amplifier(tuner, dvdPlayer, cdPlayer)
        val popcornPopper = PopcornPopper()
        val screen = Screen()
        val theatreLights = TheatreLights()
        val awesomeTheatre = HomeTheatreFacade(amp, popcornPopper, screen, theatreLights, projector)

        assertEquals("Playing Indiana Jones", awesomeTheatre.watchMovie())
    }
}