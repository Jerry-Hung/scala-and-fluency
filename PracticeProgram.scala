package pioneer.practice

import Practice.square
import Practice.repeat

object PracticeProgram extends App {
  print("Enter a number: ")
  val inputNumber = scala.io.StdIn.readInt()
  val result = square(inputNumber)
  println(s"The square of ${inputNumber} is ${result}.")
  print("Enter a String: ")
  val inputString = scala.io.StdIn.readLine()
  val string = repeat(inputString)
  println("repeating: " + string)
}