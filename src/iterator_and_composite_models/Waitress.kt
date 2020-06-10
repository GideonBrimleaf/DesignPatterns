package iterator_and_composite_models

class Waitress(
    private val pancakeHouseMenu: PancakeHouseMenu,
    private val dinerMenu: DinerMenu
) {
    fun printMenu():String {
        val pancakeIterator = pancakeHouseMenu.createIterator()
        val dinerIterator = dinerMenu.createIterator()

        val breakfastItems = getMenuItems(pancakeIterator)
        val dinnerResults = getMenuItems(dinerIterator)

        return "Breakfast Menu: $breakfastItems Dinner Menu: $dinnerResults"
    }

    private fun getMenuItems(iterator: Iterator):String {
        var results = ""
        while (iterator.hasNext()) {
            val menuItem = iterator.next() as MenuItem
            results += menuItem.name + " - " + menuItem.description + " - " + menuItem.price + " "
        }
        return results
    }
}