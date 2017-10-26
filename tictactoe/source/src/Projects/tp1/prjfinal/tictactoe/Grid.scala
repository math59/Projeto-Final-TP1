package Projects.tp1.prjfinal.tictactoe

class Grid {
  var tile = new Tiles
  var table = Array.ofDim[String](3,3)

  def make: Unit ={ //Cria o tabuleiro 3x3 vazio
    for (i <- 0 until 3)
      for (j <- 0 until 3)
        table(i)(j) = tile.criar
  }

  def show: Unit ={ //Mostra estado atual do tabuleiro
    for (i <- 0 until 3) {
      println()
      for (j <- 0 until 3)
        print(table(i)(j))
    }
  }

  def play(i: Int, j: Int, turn: Player): Unit ={ //Processa uma jogada e passa turno
    if(turn.qplayer == true)
      table(i)(j) = tile.makeX
    else table(i)(j) = tile.makeO
    this.show
    turn.switch
  }
}
