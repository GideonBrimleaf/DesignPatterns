package test.command_pattern_test

import command_pattern_models.light.Light
import command_pattern_models.light.LightOnCommand
import command_pattern_models.RemoteControl
import command_pattern_models.garage_door.GarageDoor
import command_pattern_models.garage_door.GarageDoorOpenCommand
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class RemoteControlTest {
    private var remote = RemoteControl()

    @Test
    fun `Can we do a remote?`(){
        val light = Light()
        val lightOn = LightOnCommand(light)

        remote.slot = lightOn
        assertEquals(remote.smashThatButton(), "Flame On!")
    }

    @Test
    fun `Can we open a garage door?`(){
        val garageDoor = GarageDoor()
        val garageDoorOpenCommand = GarageDoorOpenCommand(garageDoor)

        remote.slot = garageDoorOpenCommand
        assertEquals(remote.smashThatButton(), "Going up!")
    }
}