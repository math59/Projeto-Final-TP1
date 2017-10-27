package Projects.tp1.prjfinal.tictactoe

class Player {
  var qplayer: Boolean = true // true = X e false = O
  val p1 = "X"
  val p2 = "O"

    def switch: Unit = {
      qplayer = !qplayer
      if(qplayer == true) println("\nÉ a vez de " ++ p1 ++ "!")
      else println("\nÉ a vez de " ++ p2 ++ "!")
    }
}
