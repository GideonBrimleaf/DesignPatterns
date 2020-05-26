package command_pattern_models

class PartyCommand(private val commands:MutableList<Command>) : Command {

    override fun execute(): String {
        var result = ""
        commands.forEach {result += it.execute() + " "}
        return result.trimEnd()
    }

    override fun undo(): String {
        var result = ""
        commands.forEach {result += it.undo() + " "}
        return result.trimEnd()
    }
}