package analyser
import analyser.MoodAnalyser
import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._

class MoodAnalyserTest extends TestCase{

  @Test
  def test1(): Unit ={
   val m:MoodAnalyser = new MoodAnalyser()
    val msg = "Mood changes everything"
    assertEquals(m.analyseMood(msg),"SAD")

  }



}
