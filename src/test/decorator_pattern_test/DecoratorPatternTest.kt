package test.decorator_pattern_test

import decorator_pattern_models.*
import org.junit.Test
import kotlin.test.assertEquals

class DecoratorPatternTest {

    @Test
    fun `Wrapping a Dark Roast Mocha`(){
        var darkRoastMocha:Beverage = DarkRoast()
        darkRoastMocha = Mocha(darkRoastMocha)
        darkRoastMocha = Mocha(darkRoastMocha)
        darkRoastMocha = Whip(darkRoastMocha)
        assertEquals("Dark Roast, Mocha, Mocha, Whip", darkRoastMocha.description)
        assertEquals(1.49, darkRoastMocha.cost())
    }

    @Test
    fun `Wrapping up a House Blend Soy`(){
        var houseBlendSoyMochaWhip:Beverage = HouseBlend()
        houseBlendSoyMochaWhip = Soy(houseBlendSoyMochaWhip)
        houseBlendSoyMochaWhip = Mocha(houseBlendSoyMochaWhip)
        houseBlendSoyMochaWhip = Whip(houseBlendSoyMochaWhip)
        assertEquals("House Blend Coffee, Soy, Mocha, Whip", houseBlendSoyMochaWhip.description)
        assertEquals(1.34, houseBlendSoyMochaWhip.cost())
    }

}