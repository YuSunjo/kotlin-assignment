package baseball.service

class BaseballSystem {

    fun countBaseball(inputNumber: Int, randomBall: Int): Boolean {
        var strike = 0
        var ball = 0
        val inputNumberList = inputNumber.toString().map { it.toString().toInt() }
        val baseballNumberList = randomBall.toString().map { it.toString().toInt() }
        for (i in 0..2) {
            if (inputNumberList[i] == baseballNumberList[i]) {
                strike++
            } else if (inputNumberList[i] in baseballNumberList) {
                ball++
            }
        }
        return if (strike == 3) {
            println("$strike 스트라이크")
            println("3개의 숫자를 모두 맞히셨습니다!")
            true
        } else {
            println("$strike 스트라이크, $ball 볼")
            false
        }
    }

}