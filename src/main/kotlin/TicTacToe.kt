class TicTacToe {
    private val board = Array(3) { arrayOfNulls<String>(3) }

    init {
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                board[i][j] = "-"
            }
        }
    }

    fun printBoard() {
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                print("${board[i][j]} ")
            }
            println()
        }
    }
    fun makeMove(symbol: String, row: Int, col: Int): Boolean {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != "-") {
            return false
        }
        board[row][col] = symbol
        return true
    }

    fun switchPlayer(symbol: String): String {
        return if (symbol == "X") {
            "O"
        } else {
            "X"
        }
    }

    fun checkForWin(symbol: String, board1: Array<Array<String?>> = board): Boolean {
        // Проверка горизонтальных линий
        for (i in 0 until 3) {
            if (board1[i][0] == symbol && board1[i][1] == symbol && board1[i][2] == symbol) {
                return true
            }
        }
        // Проверка вертикальных линий
        for (j in 0 until 3) {
            if (board1[0][j] == symbol && board1[1][j] == symbol && board1[2][j] == symbol) {
                return true
            }
        }
        // Проверка диагональных линий
        if (board1[0][0] == symbol && board1[1][1] == symbol && board1[2][2] == symbol) {
            return true
        }
        if (board1[0][2] == symbol && board1[1][1] == symbol && board1[2][0] == symbol) {
            return true
        }
        return false
    }
}