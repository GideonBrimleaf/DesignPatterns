package iterator_and_composite_models

class DinerMenuIterator(private val items:Array<MenuItem>) : Iterator {
    var position = 0

    override fun next(): Any {
        val menuItem = items[position]
        position += 1
        return menuItem
    }

    override fun hasNext(): Boolean {
        return position < items.size
    }
}