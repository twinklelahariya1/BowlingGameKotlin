import junit.framework.Assert.assertEquals
import org.junit.Test

class GameTest {

    private val game = Game()

    @Test
    fun shouldReturnScore0_WhenAllRolls0() {
        rollZeroes(20)

        assertEquals(0, game.score())
    }

    @Test
    fun shouldReturnScore1_WhenOneRollIs1() {
        rollZeroes(19)
        game.roll(1)

        assertEquals(1, game.score())
    }

    private fun rollZeroes(n : Int) {
        for (x in 1..n) {
            game.roll(0)
        }
    }

    @Test
    fun shouldBeAbleToRollMax10PinsInOneFrame(){
        game.roll(9)
        game.roll(1)
        rollZeroes(18)

        assertEquals(10, game.score())
    }

    @Test
    fun shouldBeAbleToRollMax10PinsInOneFrame2(){
        game.roll(9)
        game.roll(12)
        rollZeroes(18)

        assertEquals(9, game.score())
    }

    @Test
    fun shouldPlayASpareWhenRollInFirstFrame() {
        game.roll(9)
        game.roll(1)
        game.roll(2)
        game.roll(1)
        rollZeroes(16)

        assertEquals(15, game.score())
    }

    @Test
    fun shouldPlayASpareWhenRollIn2Frames() {
        game.roll(9)
        game.roll(1)
        game.roll(8)
        game.roll(2)
        rollZeroes(16)

        assertEquals(28, game.score())
    }
}