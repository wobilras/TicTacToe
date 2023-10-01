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
}