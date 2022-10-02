package baseball.service

import baseball.domain.Player

class BaseballFacade(
    private val baseballSystem: BaseballSystem,
    private val baseballMessenger: BaseballMessenger,
    private val player: Player
) {
    fun startGame() {
        baseballMessenger.numberInputMessage()
        val inputNumber = player.numberInput()
        baseballSystem.play(inputNumber)
    }
}