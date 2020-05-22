package test.command_pattern_test

import command_pattern_models.light.Light
import command_pattern_models.light.LightOnCommand
import command_pattern_models.RemoteControl
import command_pattern_models.ceiling_fan.CeilingFan
import command_pattern_models.ceiling_fan.CeilingFanOffCommand
import command_pattern_models.ceiling_fan.CeilingFanOnCommand
import command_pattern_models.garage_door.GarageDoor
import command_pattern_models.garage_door.GarageDoorCloseCommand
import command_pattern_models.garage_door.GarageDoorOpenCommand
import command_pattern_models.light.LightOffCommand
import command_pattern_models.stereo.Stereo
import command_pattern_models.stereo.StereoOffCommand
import command_pattern_models.stereo.StereoOnCommand
import org.junit.Ignore
import org.junit.Test
import kotlin.test.assertEquals

class RemoteControlTest {
    private var remote = RemoteControl()

    @Test
    fun `Can we do a remote?`(){
        val light = Light()
        val lightOn = LightOnCommand(light)

        remote.slot = lightOn
        assertEquals(remote.smashThatButton(), "Living Room Flame On!")
    }

    @Test
    fun `Can we open a garage door?`(){
        val garageDoor = GarageDoor()
        val garageDoorOpenCommand = GarageDoorOpenCommand(garageDoor)

        remote.slot = garageDoorOpenCommand
        assertEquals(remote.smashThatButton(), "Going up!")
    }

    @Test
    fun `Can we do multiple controls?`() {
        val livingRoomLight = Light("Living Room")
        val kitchenLight = Light("Kitchen")
        val ceilingFan = CeilingFan("Living Room")
        val garageDoor = GarageDoor()
        val stereo = Stereo()

        val livingRoomOn = LightOnCommand(livingRoomLight)
        val livingRoomOff = LightOffCommand(livingRoomLight)
        val kitchenLightOn = LightOnCommand(kitchenLight)
        val kitchenLightOff = LightOffCommand(kitchenLight)

        val ceilingFanOn = CeilingFanOnCommand(ceilingFan)
        val ceilingFanOff = CeilingFanOffCommand(ceilingFan)

        val garageDoorOpen = GarageDoorOpenCommand(garageDoor)
        val garageDoorClosed = GarageDoorCloseCommand(garageDoor)

        val stereoOn = StereoOnCommand(stereo)
        val stereoOff = StereoOffCommand(stereo)

        remote.onCommands.add(livingRoomOn)
        remote.offCommands.add(livingRoomOff)
        remote.onCommands.add(kitchenLightOn)
        remote.offCommands.add(kitchenLightOff)
        remote.onCommands.add(ceilingFanOn)
        remote.offCommands.add(ceilingFanOff)
        remote.onCommands.add(garageDoorOpen)
        remote.offCommands.add(garageDoorClosed)
        remote.onCommands.add(stereoOn)
        remote.offCommands.add(stereoOff)

        assertEquals("Living Room speed is 10", remote.onButtonPushed(3))
        assertEquals("Living Room speed is 0", remote.undoButtonPush())
        assertEquals("Powering down", remote.offButtonPush(5))
    }
}