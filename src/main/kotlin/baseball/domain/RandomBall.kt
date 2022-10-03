package baseball.domain

class RandomBall {

    val ball = (100..999).random()

    companion object {
        fun getRandomBall(): Int {
            return RandomBall().ball
        }
    }

}