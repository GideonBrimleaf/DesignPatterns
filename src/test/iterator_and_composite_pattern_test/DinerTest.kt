package test.iterator_and_composite_pattern_test

import iterator_and_composite_models.DinerMenu
import iterator_and_composite_models.PancakeHouseMenu
import iterator_and_composite_models.Waitress
import org.junit.Test
import kotlin.test.assertEquals

class DinerTest {

    @Test
    fun `Can recall the menu items`() {
        val pancakeHouseMenu = PancakeHouseMenu()
        val dinerMenu = DinerMenu()

        val janet = Waitress(pancakeHouseMenu, dinerMenu)
        assertEquals(
            "Breakfast Menu: K&B's Pancake Breakfast - Pancakes with Scrambled Eggs and Toast - 2.99 " +
                    "Regular Pancake Breakfast - Pancakes with Fried Eggs and Sausage - 2.99 " +
                    "Blueberry Pancakes - Pancakes with Fresh Blueberries - 3.49 " +
                    "Waffles - Waffles with your choice of strawberries - 3.59  " +
                    "Dinner Menu: Vegetarian BLT - (Fakin') Bacon with lettuce & tomato on whole wheat - 2.99 " +
                    "BLT - Bacon with lettuce & tomato on whole wheat - 2.99 " +
                    "Soup of the day - Soup of the day, with a side of potato salad - 3.29 " +
                    "Hotdog - A hot dog, with saurkraut, relish, onions, topped with cheese - 3.05 " +
                    "Steamed Veggies and Brown Rice - Steamed vegetables over brown rice - 3.99 " +
                    "Pasta - Spaghetti with Marinara Sauce, and a slice of sourdough bread - 3.89 ",
            janet.printMenu()
        )
    }
}