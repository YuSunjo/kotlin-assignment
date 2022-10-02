package baseball.config

import baseball.controller.BaseballController
import baseball.domain.Player
import baseball.service.BaseballFacade
import baseball.service.BaseballMessenger
import baseball.service.BaseballSystem

class AppConfig {

    fun baseballController(): BaseballController {
        return BaseballController(baseballFacade())
    }

    private fun baseballFacade(): BaseballFacade {
        return BaseballFacade(baseballSystem(), baseballMessenger(), player())
    }

    private fun baseballSystem(): BaseballSystem {
        return BaseballSystem()
    }

    private fun baseballMessenger(): BaseballMessenger {
        return BaseballMessenger()
    }

    private fun player(): Player {
        return Player()
    }

}