package iterator_and_composite_models

class PancakeHouseIterator(private val menuItems: MutableList<MenuItem>) : Iterator {
    private var position = 0

    override fun next(): Any {
        val menuItem = menuItems[position]
        position += 1
        return menuItem
    }

    override fun hasNext(): Boolean {
        return position < menuItems.size
    }
}