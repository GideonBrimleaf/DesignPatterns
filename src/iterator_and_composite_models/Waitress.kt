package iterator_and_composite_models

import kotlin.collections.Iterator

class Waitress(
    private val breakfastMenu: Menu,
    private val dinnerMenu: Menu
) {
    fun printMenu():String {
        val breakfastIterator = breakfastMenu.createIterator()
        val dinnerIterator = dinnerMenu.createIterator()

        val breakfastItems = getMenuItems(breakfastIterator)
        val dinnerResults = getMenuItems(dinnerIterator)

        return "Breakfast Menu: $breakfastItems Dinner Menu: $dinnerResults"
    }

    private fun getMenuItems(iterator: Iterator<MenuItem>):String {
        var results = ""
        while (iterator.hasNext()) {
            val menuItem = iterator.next() as MenuItem
            results += menuItem.name + " - " + menuItem.description + " - " + menuItem.price + " "
        }
        return results
    }
}