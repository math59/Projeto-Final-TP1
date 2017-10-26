package Projects.tp1.prjfinal.tictactoe

import scala.io.StdIn.readInt

object Main extends App {
  var start = new Grid
  var player = new Player
  var control = 0
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
    control += control
  }while(control <= 9) // Condição só pra testar se tava alternando os turnos
}
