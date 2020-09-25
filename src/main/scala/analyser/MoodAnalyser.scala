package analyser

case class MoodAnalysisException(msg: String) extends Exception(msg)
case class NoSuchFieldException(msg: String) extends Exception(msg)
case class NullValueException(msg: String) extends Exception(msg)

trait Analyser {
  def analyseMood(msg: String): String
  def equals(obj: Any): Boolean
}

class MoodAnalyser extends Analyser {
  var msg: String = null

  override def analyseMood(msg:String=""): String = {
    this.msg = msg
    try {
      if (this.msg == null || this.msg.equals("") ||this.msg.length == 1) {
        throw MoodAnalysisException("Empty Mood")
      } else if (this.msg.toUpperCase().contains("SAD")) {
        return "SAD"
      } else {
        "HAPPY"
      }
    } catch {
      case exception: NullPointerException => return "HAPPY"
    }
  }
  def print(): Int ={10}
  def getMsg(): String ={
    this.msg
  }

  override def equals(otherObj: Any): Boolean = {
    if ((this.getClass.hashCode() - otherObj.getClass.hashCode()) == 0) {
      true
    } else {
      false
    }
  }
}

