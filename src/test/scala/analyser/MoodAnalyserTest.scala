package analyser
import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._

class MoodAnalyserTest extends TestCase{

  @Test
  def testCase11(): Unit ={
    val msg = "I am in sad "
   val m:MoodAnalyser = new MoodAnalyser()
    assertEquals("SAD",m.analyseMood("I am in sad "))
  }

  @Test
  def testCase12(): Unit ={
    val msg = "I am in Any\nMood"
    val m:MoodAnalyser = new MoodAnalyser()
    assertEquals(m.analyseMood(msg),"HAPPY")
  }
  @Test
  def testCase21(): Unit ={
    val m:MoodAnalyser = new MoodAnalyser()
    assertEquals(m.analyseMood(""),"HAPPY")
  }
  @Test
  def testCase31(): Unit ={
    val m:MoodAnalyser = new MoodAnalyser()
    val exception = assertThrows(classOf[MoodAnalysisException], () => m.analyseMood(""))
    assertEquals("Empty Mood", exception.getMessage)

  }

  @Test
  def testCase411():Unit ={
    val analyser1 = MoodAnalyserFactory("MoodAnalyser")
    val analyser2 = MoodAnalyserFactory("MoodAnalyser")
    val a = 0
    assert(analyser1.equals(analyser2))
  }

  @Test
  def testCase412():Unit ={
    val analyser1 = MoodAnalyserFactory("MoodAnalyser")
     val num = 0
    assertFalse(analyser1.equals(num))
  }

  @Test
  def testCase42():Unit ={
    val exception = assertThrows(classOf[MoodAnalysisException], () => MoodAnalyserFactory("Moodanalyser"))
    assertEquals("No Such Class Error", exception.getMessage)
  }

  @Test
  def testCase51():Unit ={
    val obj = new MoodAnalyserReflection()
    val exception = assertThrows(classOf[NoSuchMethodException], () =>obj.executeMethodNoPara("isEmpty"))
    assertEquals("Method not found", exception.getMessage)
  }

  @Test
  def testCase62():Unit ={
    val obj = new MoodAnalyserReflection()
    assert(obj.executeMethodwithPara("print").equals(10))
  }

  @Test
  def testSetField:Unit ={
    val obj = new MoodAnalyserReflection()
    assert(obj.setFieldAndCallMethod("msg","happy").equals("happy"))
  }

  @Test
  def testSetFieldException:Unit ={
    val obj = new MoodAnalyserReflection()
    val exception = assertThrows(classOf[NoSuchFieldException], () => obj.setFieldAndCallMethod("ms","happy"))
    assertEquals("No Such Field", exception.getMessage)
  }

  @Test
  def testNullValueException:Unit ={
    val obj = new MoodAnalyserReflection()
    val exception = assertThrows(classOf[NullValueException], () => obj.setFieldAndCallMethod("ms",null))
    assertEquals("Cannot assign null value", exception.getMessage)
  }




}