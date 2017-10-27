package Projects.tp1.prjfinal.tictactoe

import scala.io.StdIn.readInt

object Main extends App {
  var start = new Grid
  var player = new Player
  var control = new GameOver
  private var i = 0
  private var j = 0

  start.make
  start.show

  println("\nÉ a vez de 'X'!") //Tornar esta mensagem automática ou não???

  do {
    println("Escolha onde quer jogar (linha): ")
    i = readInt()
    println("Escolha onde quer jogar (coluna): ")
    j = readInt()

    start.play(i, j, player)
    control.verify(start.table)
    control.count
  }while(control.counter < 9) // Melhorar condição de game over?
}
