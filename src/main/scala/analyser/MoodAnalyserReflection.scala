package analyser
class MoodAnalyserReflection {
  def executeMethod(methodName: String): Any = {
    try {
      val obj = new MoodAnalyser()
      val clss = obj.getClass
      val method = clss.getDeclaredMethod(methodName)
      return  method.invoke(obj)
    } catch {
      case exception1: NoSuchMethodException => throw new NoSuchMethodException("Method not found")
      case exception: Exception => println(exception.getMessage)
    }
  }
}
