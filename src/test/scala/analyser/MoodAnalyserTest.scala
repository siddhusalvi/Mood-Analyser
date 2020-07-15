package analyser
import analyser.MoodAnalyser
import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._

class MoodAnalyserTest extends TestCase{

  @Test
  def testCase1 1(): Unit ={
   val m:MoodAnalyser = new MoodAnalyser()
    val msg = "I am in Sad\nMood"
    assertEquals(m.analyseMood(msg),"SAD")

  }



}
