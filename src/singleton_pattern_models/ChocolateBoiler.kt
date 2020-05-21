package singleton_pattern_models

object ChocolateBoiler {
    var empty:Boolean = true
        private set
    private var boiled:Boolean = false
        private set

    fun fill(){
        if(empty){
            empty = false
            boiled = false
        }
    }

    fun drain(){
        if(!empty and boiled){
            empty = true
        }
    }

    fun boil(){
        if(!empty and !boiled){
            boiled = true
        }
    }

}