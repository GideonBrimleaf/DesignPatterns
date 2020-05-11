package observer_pattern_jutil_models

import java.awt.BorderLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JFrame

class Swinger {

    fun main(){
        val example = Swinger()
        example.go()
    }

    private fun go(){
        val frame:JFrame = JFrame()
        val button:JButton = JButton("Should I do it?")
        button.addActionListener(AngelListener())
        button.addActionListener(DevilListener())
        frame.contentPane.add(BorderLayout.CENTER, button)
    }

    class AngelListener():ActionListener{
        override fun actionPerformed(e: ActionEvent?) {
            println("Don't do it, you might regret it!")
        }
    }

    class DevilListener():ActionListener{
        override fun actionPerformed(e: ActionEvent?) {
            println("DEW It!")
        }

    }
}