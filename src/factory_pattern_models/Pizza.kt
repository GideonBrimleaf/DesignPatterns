package factory_pattern_models

abstract class Pizza {
    abstract fun prepare():String

    abstract fun bake():String

    abstract fun cut():String

    abstract fun box():String
}