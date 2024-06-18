import org.example.MoodAnalyseOne;
import org.example.MoodAnalyseOne;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class MoodAnalyserTestOne{

   @Test
  public void analyzeMood(){
    MoodAnalyseOne moodAnalyseOne=new MoodAnalyseOne("I am in Sad Mood".toLowerCase());
    String mood= moodAnalyseOne.analyzeMood();
    Assert.assertEquals(mood, "SAD");
   }

   @Test
  public void analyzeHMood(){
    MoodAnalyseOne moodAnalyseOne=new MoodAnalyseOne("I am in Any mood".toLowerCase());
    String mood=moodAnalyseOne.analyzeMood();
    Assert.assertEquals(mood, "HAPPY");
   }

   @Test
    public void NullMood(){
       MoodAnalyseOne moodAnalyseOne2=new MoodAnalyseOne(null);
       String mood=moodAnalyseOne2.analyzeMood();
       Assert.assertEquals(mood, "Happy");
   }
}
