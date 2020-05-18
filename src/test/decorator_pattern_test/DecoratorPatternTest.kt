package test.decorator_pattern_test

import decorator_pattern_models.starbuzz_coffee.*
import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals

class DecoratorPatternTest {

    @Test
    fun `Wrapping a Dark Roast Mocha`(){
        var darkRoastMocha: Beverage = DarkRoast()
        darkRoastMocha = Mocha(darkRoastMocha)
        darkRoastMocha = Mocha(darkRoastMocha)
        darkRoastMocha = Whip(darkRoastMocha)
        assertEquals("Regular Dark Roast, Mocha, Mocha, Whip", darkRoastMocha.description)
        assertEquals(1.49, darkRoastMocha.cost())
    }

    @Test
    fun `Wrapping up a House Blend Soy`(){
        var houseBlendSoyMochaWhip: Beverage = HouseBlend()
        houseBlendSoyMochaWhip = Soy(houseBlendSoyMochaWhip)
        houseBlendSoyMochaWhip =
            Mocha(houseBlendSoyMochaWhip)
        houseBlendSoyMochaWhip =
            Whip(houseBlendSoyMochaWhip)
        assertEquals("Regular House Blend Coffee, Soy, Mocha, Whip", houseBlendSoyMochaWhip.description)
        assertEquals(1.34, houseBlendSoyMochaWhip.cost())
    }

    @Test
    fun `Altering size of Coffee`(){
        var espressoMocha: Beverage = Espresso(Size.SMALL)
        espressoMocha = Mocha(espressoMocha)
        assertEquals("Small Espresso, Mocha", espressoMocha.description)
    }

    @Test
    fun `Soy price differs depending on coffee size`(){
        var houseBlendSoyMochaWhip: Beverage = HouseBlend(Size.LARGE)
        houseBlendSoyMochaWhip = Soy(houseBlendSoyMochaWhip)
        houseBlendSoyMochaWhip =
            Mocha(houseBlendSoyMochaWhip)
        houseBlendSoyMochaWhip =
            Whip(houseBlendSoyMochaWhip)
        Assert.assertEquals(1.39, houseBlendSoyMochaWhip.cost(), 0.001)
    }

}