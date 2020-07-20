package analyser
import scala.reflect.macros.internal
import scala.reflect.runtime.{universe => ru}
import ru._

object MoodAnalyserReflection extends App {

  val clss = new MoodAnalyser()

    def printMethods[T](t: T) { // requires instance
      val meths = t.getClass.getMethods
      println(meths.mkString("\n"))
    }

  printMethods(clss)

  def printMethods1(name: String) { // low-level
    val meths = Class.forName(name).getMethods
    println(meths take 5 mkString "\n")
  }

}
