package baseball.service


class BaseballSystem {

    private val baseballNumber: Int = (100..999).random()

    fun play(inputNumber: Int) {
        println(inputNumber)
        println(baseballNumber)
        countBaseball(inputNumber)

    }

    private fun countBaseball(inputNumber: Int) {
        var strike = 0
        var ball = 0
        val inputNumberList = inputNumber.toString().map { it.toString().toInt() }
        val baseballNumberList = baseballNumber.toString().map { it.toString().toInt() }
        for (i in 0..2) {
            if (inputNumberList[i] == baseballNumberList[i]) {
                strike++
            } else if (inputNumberList[i] in baseballNumberList) {
                ball++
            }
        }
        println("$strike 스트라이크 $ball 볼")
    }

}