import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class TestForBoard {
    private val ttt = TicTacToe()
    @Test
    fun testSwitch(){
        assertEquals("O",ttt.switchPlayer("X"))
        assertEquals("X",ttt.switchPlayer("O"))
    }

    @Test
    fun testMove(){
        assertEquals(true, ttt.makeMove("X",0,0))
        assertFalse(ttt.makeMove("X",1,3))
    }
}