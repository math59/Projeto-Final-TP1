package Projects.tp1.prjfinal.tictactoe

import scala.util.control.Breaks._

class GameOver {
  var check: Boolean = _
  var counter = 0
  var symbol = new Tiles

  def count: Unit ={
    counter += 1
    if(counter == 9) println("Velha! Empate.")
  }

  def verify(table: Array[Array[String]]): Unit = {
    breakable{
    for(i <- 0 until 3)
      if(table(i)(0) == symbol.play1 && table(i)(1) == symbol.play1 && table(i)(2) == symbol.play1) {
        println(symbol.play1 ++ " venceu!")
        counter = 9
      }
      else if(table(0)(i) == symbol.play1 && table(1)(i) == symbol.play1 && table(2)(i) == symbol.play1){
        println(symbol.play1 ++ " venceu!")
        counter = 9
      }
      else if (table(0)(0) == symbol.play1 && table(1)(1) == symbol.play1 && table(2)(2) == symbol.play1) {
        println(symbol.play1 ++ " venceu!")
        counter = 9
        break
      }

      else if(table(i)(0) == symbol.play2 && table(i)(1) == symbol.play2 && table(i)(2) == symbol.play2) {
        println(symbol.play2 ++ " venceu!")
        counter = 9
      }
      else if(table(0)(i) == symbol.play2 && table(1)(i) == symbol.play2 && table(2)(i) == symbol.play2){
        println(symbol.play2 ++ " venceu!")
        counter = 9
      }
      else if(table(0)(0) == symbol.play2 && table(1)(1) == symbol.play2 && table(2)(2) == symbol.play2){
        println(symbol.play2 ++ " venceu!")
        counter = 9
        break
      }
    }
  }
}
