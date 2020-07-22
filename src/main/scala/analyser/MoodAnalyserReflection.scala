package analyser

class Changer extends Analyser {
  override def analyseMood(msg: String): String = {
    val obj = new MoodAnalyser()
    val mood =  obj.analyseMood(msg)
    if(mood.equals("HAPPY")){
      return "SAD"
    }else if(mood.equals("SAD")) {
      return "HAPPY"
    }else{
      msg
    }
  }
}
class MoodAnalyserReflection {
  val obj = new MoodAnalyser()g
  val cls = obj.getClass
  def executeMethodNoPara(methodName: String): Any = {
    try {

      val method = cls.getDeclaredMethod(methodName)
      return  method.invoke(obj)
    } catch {
      case exception1: NoSuchMethodException => throw new NoSuchMethodException("Method not found")
      case exception: Exception => println(exception.getMessage)
    }
  }

  def executeMethodwithPara(methodName: String,para:String=null): Any = {
    try {
      val obj = new MoodAnalyser()
      val clss = obj.getClass
      val method = clss.getDeclaredMethod(methodName,classOf[String])
      return  method.invoke(obj,para)
    } catch {
      case exception1: NoSuchMethodException => throw new NoSuchMethodException("Method not found")
      case exception: Exception => println(exception.getMessage)
    }
  }
  def changeBehaviour(msg:String):String={
    val obj = new Changer()
    return obj.analyseMood(msg)
  }
  def setFieldAndCallMethod(fieldname:String,fieldPara:String): Any ={
    try {

      if(fieldPara == null)
        {
          throw new NullValueException("Cannot assign null value")
        }
      val field = cls.getDeclaredField(fieldname)
      field.setAccessible(true);
      field.set(obj, fieldPara)
      val method = cls.getDeclaredMethod("getMsg");
      return method.invoke(obj)

    }catch {
      case exception1: NoSuchFieldException => throw new NoSuchFieldException("No Such Field")
      case exception2: NullValueException => throw NullValueException("Cannot assign null value")
      case exception: Exception => println(exception.getMessage)
    }

  }


}