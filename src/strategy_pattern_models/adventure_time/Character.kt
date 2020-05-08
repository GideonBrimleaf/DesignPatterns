package strategy_pattern_models.adventure_time

abstract class Character(private val name:String, internal var weapon:WeaponBehaviour) {
    abstract fun fight():String
}