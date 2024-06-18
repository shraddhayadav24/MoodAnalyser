import org.example.MoodAnalyseOne;
import org.example.MoodAnalyseOne;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class MoodAnalyserTestOne {
    @Test
   public  void analyzeMood(){
    MoodAnalyseOne moodAnalyseOne1=new MoodAnalyseOne();
    String mood= moodAnalyseOne1.analyzeMood("I  am in Any mood".toLowerCase());
    Assert.assertEquals(mood, "Happy");
    }



}
