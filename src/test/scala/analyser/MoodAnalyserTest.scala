package analyser
import analyser.MoodAnalyser
import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._

class MoodAnalyserTest extends TestCase{

  @Test
  def testCase11(): Unit ={
    val msg = "I am in Sad\\nMood"
   val m:MoodAnalyser = new MoodAnalyser()
    assertEquals(m.analyseMood(),"SAD")
  }

  @Test
  def testCase12(): Unit ={
    val msg = "I am in Any\nMood"
    val m:MoodAnalyser = new MoodAnalyser()
    assertEquals(m.analyseMood(),"HAPPY")
  }
  @Test
  def testCase21(): Unit ={
    val m:MoodAnalyser = new MoodAnalyser("")
    assertEquals(m.analyseMood(),"HAPPY")
  }
  @Test
  def testCase31(): Unit ={
    val m:MoodAnalyser = new MoodAnalyser()
    val exception = assertThrows(classOf[MoodAnalysisException], () => m.analyseMood())
    assertEquals("Empty Message", exception.getMessage)

  }




}
