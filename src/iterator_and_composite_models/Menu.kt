package iterator_and_composite_models

interface Menu {
    fun createIterator():Iterator<MenuItem>
}