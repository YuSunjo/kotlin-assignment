package baseball.service

import baseball.domain.Player
import baseball.domain.RandomBall

class BaseballFacade(
    private val baseballSystem: BaseballSystem,
    private val baseballMessenger: BaseballMessenger,
    private val player: Player
) {
    fun startGame(): Boolean {
        val randomBall = RandomBall.getRandomBall()

        while (true) {
            baseballMessenger.numberInputMessage()
            val inputNumber = player.numberInput()
            if (baseballSystem.countBaseball(inputNumber, randomBall)) {
                baseballMessenger.restartMessage()
                return player.restartInput()
            }
        }

    }
}