package analyser

class MoodAnalyser{
  var msg = ""
  def this(msg:String){
    this()
    this.msg = msg
  }

  def analyseMood():String = {
    if (this.msg.toLowerCase.contains("sad")) {"SAD"}else{ "HAPPY"}
 }
}