import org.example.MoodAnalyseOne;
import org.example.MoodAnalyseOne;
import org.example.MoodAnalyzerException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class MoodAnalyserTestOne {

    @Test
    public void analyzeMood() throws MoodAnalyzerException {
        MoodAnalyseOne moodAnalyseOne = new MoodAnalyseOne("I am in Sad Mood".toLowerCase());
        String mood = moodAnalyseOne.analyzeMood();
        Assert.assertEquals(mood, "SAD");
    }

    @Test
    public void analyzeHMood() throws MoodAnalyzerException {
        MoodAnalyseOne moodAnalyseOne = new MoodAnalyseOne("I am in Any mood".toLowerCase());
        String mood = moodAnalyseOne.analyzeMood();
        Assert.assertEquals(mood, "HAPPY");
    }

    @Test
    public void NullMood() throws  MoodAnalyzerException{
        MoodAnalyseOne moodAnalyseOne=new MoodAnalyseOne(null);
        try {
            moodAnalyseOne.analyzeMood(null);
        }catch (MoodAnalyzerException e){
            Assert.assertEquals("enter the valid input", e.getMessage());
        }

    }
}
