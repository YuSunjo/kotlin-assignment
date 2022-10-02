package baseball.controller

import baseball.service.BaseballFacade

class BaseballController(
    private val baseballFacade: BaseballFacade
) {
    fun play() {
        // 게임 시작
        baseballFacade.startGame()
    }
}