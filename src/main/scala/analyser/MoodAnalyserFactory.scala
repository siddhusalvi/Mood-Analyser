package analyser

object MoodAnalyserFactory{
  def apply(className:String): MoodAnalyser ={
    className  match{
      case "MoodAnalyser" => new MoodAnalyser()
      case _ => throw new MoodAnalysisException("unknown class")

    }
  }

}
