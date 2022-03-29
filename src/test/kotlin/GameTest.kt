import junit.framework.Assert.assertEquals
import org.junit.Test

class GameTest {

    private val game = Game()

    @Test
    fun shouldReturnScore0_WhenAllRolls0() {
        for(x in 1..20){
            game.roll(0)
        }
        assertEquals(0, game.score())
    }
}