package strategy_pattern_models.adventure_time

class ShortSword : WeaponBehaviour {
    override fun useWeapon(): String {
        return "Swish Swish! Clang Clang!"
    }
}