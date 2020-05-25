package test.command_pattern_test

import command_pattern_models.light.Light
import command_pattern_models.light.LightOnCommand
import command_pattern_models.RemoteControl
import command_pattern_models.ceiling_fan.*
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

        val ceilingFanLow = CeilingFanLowCommand(ceilingFan)
        val ceilingFanOff = CeilingFanOffCommand(ceilingFan)

        val garageDoorOpen = GarageDoorOpenCommand(garageDoor)
        val garageDoorClosed = GarageDoorCloseCommand(garageDoor)

        val stereoOn = StereoOnCommand(stereo)
        val stereoOff = StereoOffCommand(stereo)

        remote.onCommands.addAll(
            listOf(
                livingRoomOn, kitchenLightOn, ceilingFanLow,
                garageDoorOpen, stereoOn
            )
        )

        remote.offCommands.addAll(
            listOf(
                livingRoomOff, kitchenLightOff, ceilingFanOff,
                garageDoorClosed, stereoOff
            )
        )

        assertEquals("Living Room speed is 1", remote.onButtonPushed(3))
        assertEquals("Living Room speed is 0", remote.undoButtonPush())
        assertEquals("Powering down", remote.offButtonPush(5))
    }

    @Test
    fun `Can we undo variable speeds?`() {
        val ceilingFan = CeilingFan("Living Room")

        val ceilingFanMedium = CeilingFanMediumCommand(ceilingFan)
        val ceilingFanHigh = CeilingFanHighCommand(ceilingFan)
        val ceilingFanOff = CeilingFanOffCommand(ceilingFan)

        remote.onCommands.add(ceilingFanMedium)
        remote.offCommands.add(ceilingFanOff)
        remote.onCommands.add(ceilingFanHigh)
        remote.offCommands.add(ceilingFanOff)

        assertEquals("Living Room speed is 2", remote.onButtonPushed(1))
        assertEquals("Living Room speed is 3", remote.onButtonPushed(2))
        assertEquals("Living Room speed is 2", remote.undoButtonPush())
        assertEquals("Living Room speed is 0", remote.offButtonPush(1))

    }
}