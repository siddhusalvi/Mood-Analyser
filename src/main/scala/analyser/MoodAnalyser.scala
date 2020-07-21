package analyser

case class MoodAnalysisException(msg: String) extends Exception(msg)

trait Analyser {
  def analyseMood(msg: String): String
  def equals(obj: Any): Boolean
}

class MoodAnalyser extends Analyser {
  var msg: String = null

  override def analyseMood(msg:String): String = {
    try {
      if (msg == null) {
        throw MoodAnalysisException("Empty Mood")
      } else if (this.msg.toLowerCase.contains("sad")) {
        "SAD"
      } else {
        "HAPPY"
      }
    } catch {
      case exception: NullPointerException => return "HAPPY"
    }
  }
  def print(): Int ={10}


  override def equals(otherObj: Any): Boolean = {
    if ((this.getClass.hashCode() - otherObj.getClass.hashCode()) == 0) {
      true
    } else {
      false
    }
  }
}

