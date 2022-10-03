package baseball.domain

import kotlin.system.exitProcess

class Player {
    fun numberInput(): Int {
        return try {
            readLine()!!.toInt()
        } catch (e: Exception) {
            println("올바르 숫자를 입력해주세요")
            numberInput()
        }
    }

    fun restartInput(): Boolean {
        return when (readLine()!!.toInt()) {
            1 -> true
            2 -> exitProcess(0)
            else -> {
                println("올바른 숫자를 입력해주세요")
                restartInput()
            }
        }
    }

}