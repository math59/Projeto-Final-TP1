package Projects.tp1.prjfinal.tictactoe

class Player {
  var qplayer: Boolean = true // true = X e false = O

  def switch: Unit = {
    qplayer = !qplayer
    if(qplayer == true) println("\nÉ a vez de 'X'!")
    else println("\nÉ a vez de 'O'!")
  }

}
