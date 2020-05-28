package test.template_method_pattern

import org.junit.Test
import template_method_pattern_models.Coffee
import template_method_pattern_models.Tea
import kotlin.test.assertEquals

class TemplateMethodPatternTest {

    @Test
    fun `Drink changes brew`() {
        val maCoffee = Coffee()
        val maTea = Tea()

        assertEquals("Adding sugar and milk", maCoffee.prepareRecipe())
        assertEquals("Adding lemons", maTea.prepareRecipe())
    }

    @Test
    fun `Coffee without condiments`() {
        val coffeeNoCondiments = Coffee(false)

        assertEquals("Dripping coffee through filter", coffeeNoCondiments.prepareRecipe())
    }
}