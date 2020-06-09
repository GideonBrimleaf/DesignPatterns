package iterator_and_composite_models

class DinerMenu {

    companion object {
        const val MAX_ITEMS = 6
    }

    var numberOfItems = 0
    var menuItems: Array<MenuItem?>

    init {
        menuItems = arrayOfNulls(MAX_ITEMS)
        addItem(
            "Vegetarian BLT",
            "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99
        )
        addItem(
            "BLT",
            "Bacon with lettuce & tomato on whole wheat", false, 2.99
        )
        addItem(
            "Soup of the day",
            "Soup of the day, with a side of potato salad", false, 3.29
        )
        addItem(
            "Hotdog",
            "A hot dog, with saurkraut, relish, onions, topped with cheese",
            false, 3.05
        )
        addItem(
            "Steamed Veggies and Brown Rice",
            "Steamed vegetables over brown rice", true, 3.99
        )
        addItem(
            "Pasta",
            "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
            true, 3.89
        )
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