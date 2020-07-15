package analyser
case class MoodAnalysisException(msg:String) extends Exception(msg)
class MoodAnalyser{
  var msg:String = null
  def this(msg:String){
    this()
    this.msg = msg
  }


  def analyseMood():String = {
    try {
      if(msg == null){
        throw new MoodAnalysisException("Empty Message")
      }else if (this.msg.toLowerCase.contains("sad")) {
        "SAD"
      } else {
        "HAPPY"
      }
    }catch {
      case exception: NullPointerException => return "HAPPY"
    }
 }
}