package iterator_and_composite_models

class PancakeHouseMenu {
    var menuItems = mutableListOf<MenuItem>()
        private set

    init {
        addItem(
            "K&B's Pancake Breakfast",
            "Pancakes with Scrambled Eggs and Toast",
            true,
            2.99
        )
        addItem(
            "Regular Pancake Breakfast",
            "Pancakes with Fried Eggs and Sausage",
            false,
            2.99
        )
        addItem(
            "Blueberry Pancakes",
            "Pancakes with Fresh Blueberries",
            true,
            3.49
        )
        addItem(
            "Waffles",
            "Waffles with your choice of strawberries",
            true,
            3.59
        )
    }

    private fun addItem(name:String, description:String, vegetarian:Boolean, price:Double) {
        val menuItem = MenuItem(name, description, vegetarian, price)
        menuItems.add(menuItem)
    }
}