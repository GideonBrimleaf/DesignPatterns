package test.command_pattern_test

import command_pattern_models.light.Light
import command_pattern_models.light.LightOnCommand
import command_pattern_models.RemoteControl
import org.junit.Test
import kotlin.test.assertEquals

class RemoteControlTest {

    @Test
    fun `Can we do a remote?`(){
        val remote = RemoteControl()
        val light = Light()
        val lightOn = LightOnCommand(light)

        remote.slot = lightOn
        assertEquals(remote.smashThatButton(), "Flame On!")
    }
}