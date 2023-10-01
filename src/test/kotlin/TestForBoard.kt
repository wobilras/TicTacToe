import org.junit.jupiter.api.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

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
    @Test
    fun testWin(){
        val board = Array(3) { arrayOfNulls<String>(3) }
        for (i in 0 until 3) {
            board[0][i]="X"
        }
        assertTrue(ttt.checkForWin("X",board))
        assertFalse(ttt.checkForWin("X"))
        for (i in 0 until 3) {
            board[i][0]="X"
        }
        assertTrue(ttt.checkForWin("X",board))
        board[0][0]="O"
        board[1][1]="O"
        board[2][2]="O"
        assertTrue(ttt.checkForWin("O",board))
        board[0][2]="O"
        board[2][0]="O"
        assertTrue(ttt.checkForWin("O",board))
    }
}