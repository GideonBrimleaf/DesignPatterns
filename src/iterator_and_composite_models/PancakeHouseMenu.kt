package iterator_and_composite_models

class PancakeHouseMenu {
    val menuItems = mutableListOf(
        MenuItem(
            "K&B's Pancake Breakfast",
            "Pancakes with Scrambled Eggs and Toast",
            true,
            2.99
        ),
        MenuItem(
            "Regular Pancake Breakfast",
            "Pancakes with Fried Eggs and Sausage",
            false,
            2.99
        ),
        MenuItem(
            "Blueberry Pancakes",
            "Pancakes with Fresh Blueberries",
            true,
            3.49
        ),
        MenuItem(
            "Waffles",
            "Waffles with your choice of strawberries",
            true,
            3.59
        )

    )

    fun createIterator():Iterator {
        return PancakeHouseIterator(menuItems)
    }

    private fun addItem(name:String, description:String, vegetarian:Boolean, price:Double) {
        val menuItem = MenuItem(name, description, vegetarian, price)
        menuItems.add(menuItem)
    }
}