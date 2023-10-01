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
}