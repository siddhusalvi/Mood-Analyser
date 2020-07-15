package analyser

class MoodAnalyser{
  def analyseMood(msg:String):String = {
    if (msg.toLowerCase.contains("sad")) {"SAD"}else{ "HAPPY"}
 }
}