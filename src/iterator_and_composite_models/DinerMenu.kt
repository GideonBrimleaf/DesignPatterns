package iterator_and_composite_models

import kotlin.collections.Iterator

class DinerMenu : Menu {

    companion object {
        const val MAX_ITEMS = 6
    }

    private var numberOfItems = 0
    private val menuItems = arrayOf(
        MenuItem(
            "Vegetarian BLT",
            "(Fakin') Bacon with lettuce & tomato on whole wheat",
            true,
            2.99
        ),
        MenuItem(
            "BLT",
            "Bacon with lettuce & tomato on whole wheat",
            false,
            2.99
        ),
        MenuItem(
            "Soup of the day",
            "Soup of the day, with a side of potato salad",
            false,
            3.29
        ),
        MenuItem(
            "Hotdog",
            "A hot dog, with saurkraut, relish, onions, topped with cheese",
            false,
            3.05
        ),
        MenuItem(
            "Steamed Veggies and Brown Rice",
            "Steamed vegetables over brown rice",
            true,
            3.99
        ),
        MenuItem(
            "Pasta",
            "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
            true,
            3.89
        )
    )

    override fun createIterator(): Iterator<MenuItem> {
//      The exercise here has us implement our own DinerIterator class here which implements
//      the Java Util Iterator interface.  This is part of the design pattern learning but
//      Kotlin seems tom be awesome enough to give us this for free to why not?
        return menuItems.iterator()
    }

    private fun addItem(
        name: String, description: String,
        vegetarian: Boolean, price: Double
    ) {
        val menuItem =
            MenuItem(name, description, vegetarian, price)
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu")
        } else {
            menuItems[numberOfItems] = menuItem
            numberOfItems += 1
        }
    }
}