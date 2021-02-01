package com.lsgggg123.demo.kotlin.innerclass

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.WindowEvent
import javax.swing.JButton
import javax.swing.JFrame
import java.awt.event.WindowAdapter as WindowAdapter1

fun main() {
    val jFrame = JFrame("title")
    val jButton = JButton("confirm")
    jFrame.addWindowListener(object: WindowAdapter1() {
        override fun windowOpened(e: WindowEvent?) {
            println("windowOpened")
            super.windowOpened(e)
        }
        override fun windowActivated(e: WindowEvent?) {
            println("windowActivated")
            super.windowActivated(e)
        }
    })

    jButton.addActionListener { println("clicked") }
    jFrame.add(jButton)
    jFrame.pack()
    jFrame.isVisible = true
    jFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
}