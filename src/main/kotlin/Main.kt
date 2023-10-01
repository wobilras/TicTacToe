fun main() {
        val game = TicTacToe()
        var currentPlayer = "X"

        while (true) {
                game.printBoard()
                println("Ход игрока $currentPlayer. Введите номер строки и номер столбца для хода (например, '1 1' для хода в центр поля):")
                val input = readLine()

                if (input != null) {
                        val numbers = input.split(" ")
                        if (numbers.size == 2) {
                                val row = numbers[0].toInt()
                                val col = numbers[1].toInt()

                                if (game.makeMove(currentPlayer, row, col)) {
                                        if (game.checkForWin(currentPlayer)) {
                                                game.printBoard()
                                                println("Игрок $currentPlayer победил!")
                                                break
                                        }

                                        currentPlayer = game.switchPlayer(currentPlayer)
                                } else {
                                        println("Некорректный ход. Попробуйте еще раз.")
                                }
                        }
                }
        }
}