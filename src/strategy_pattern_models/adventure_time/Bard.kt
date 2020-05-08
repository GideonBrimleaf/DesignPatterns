package strategy_pattern_models.adventure_time

class Bard(name:String) : Character(name, Lute()) {
    override fun fight(): String {
        return weapon.useWeapon()
    }
}