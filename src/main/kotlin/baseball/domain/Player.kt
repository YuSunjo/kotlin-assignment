package baseball.domain

class Player {
    fun numberInput(): Int {
        return try {
            readLine()!!.toInt()
        } catch (e: Exception) {
            println("올바르 숫자를 입력해주세요")
            numberInput()
        }
    }
}