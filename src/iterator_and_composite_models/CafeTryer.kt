package iterator_and_composite_models

import java.util.*

class CafeTryer {
    var items: Hashtable<*, *> = Hashtable<Any?, Any?>()
    fun addItem(
        name: String?, description: String?,
        vegetarian: Boolean, price: Double
    ) {
        val menuItem =
            MenuItem(name!!, description!!, vegetarian, price)
        items[menuItem.name] = menuItem
    }

    fun createIterator(): Iterator<*> {
        return items.values.iterator()
    }

    init {
        addItem(
            "Veggie Burger and Air Fries",
            "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
            true, 3.99
        )
        addItem(
            "Soup of the day",
            "A cup of the soup of the day, with a side salad",
            false, 3.69
        )
        addItem(
            "Burrito",
            "A large burrito, with whole pinto beans, salsa, guacamole",
            true, 4.29
        )
    }
}