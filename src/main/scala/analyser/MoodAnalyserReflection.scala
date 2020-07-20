package analyser

//case class NoSuchMethodException(msg: String) extends Exception(msg)

class MoodAnalyserReflection {
  def executeMethod(methodName: String, para: Any): Unit = {
    try {
      val clss = new MoodAnalyser()
      val obj = clss.getClass
      val method = obj.getDeclaredMethod(methodName, classOf[Any])
      method.invoke(para)
    } catch {
      case exception1: NoSuchMethodException => throw new NoSuchMethodException("Method not found")
      case exception: Exception => println(exception.getMessage)
    }
  }
}
