package command_pattern_models

class NoCommand : Command {
    override fun execute(): String {
        return "nuuh"
    }
}