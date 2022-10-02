package baseball

import baseball.config.AppConfig

fun main() {
    val appConfig = AppConfig()
    val baseballController = appConfig.baseballController()
    baseballController.play()
}