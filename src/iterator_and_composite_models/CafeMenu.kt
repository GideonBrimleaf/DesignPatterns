package iterator_and_composite_models

class CafeMenu : Menu {
    private val menuItems = hashMapOf(
        "Veggie Burger and Air Fries" to MenuItem(
            "Veggie Burger and Air Fries",
            "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
            true,
            3.99
        ),
        "Soup of the day" to MenuItem(
            "Soup of the day",
            "A cup of the soup of the day, with a side salad",
            false,
            3.69
        ),
        "Burrito" to MenuItem(
            "Burrito",
            "A large burrito, with whole pinto beans, salsa, guacamole",
            true,
            4.29
        )
    )

    fun addItem(
        name: String, description: String,
        vegetarian: Boolean, price: Double
    ) {
        val menuItem =
            MenuItem(name, description, vegetarian, price)
        menuItems[menuItem.name] = menuItem
    }

    override fun createIterator(): Iterator<MenuItem> {
        return menuItems.values.iterator()
    }
}