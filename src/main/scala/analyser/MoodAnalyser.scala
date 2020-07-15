package analyser

class MoodAnalyser{
  var msg:String = null
  def this(msg:String){
    this()
    this.msg = msg
  }


  def analyseMood():String = {
    try {
      if (this.msg.toLowerCase.contains("sad")) {
        "SAD"
      } else {
        "HAPPY"
      }
    }catch {
      case exception: NullPointerException => return "HAPPY"
    }
 }
}