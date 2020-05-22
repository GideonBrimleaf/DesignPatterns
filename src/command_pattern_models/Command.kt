package command_pattern_models

interface Command {
    fun execute():String
    fun undo():String
}