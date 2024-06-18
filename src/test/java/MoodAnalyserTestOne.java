import org.example.MoodAnalyseOne;
import org.example.MoodAnalyseOne;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTestOne {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad(){
        MoodAnalyseOne moodAnalyse=new MoodAnalyseOne();
        String result=moodAnalyse.analyzeMood("I am in sad mood");
        Assert.assertEquals("SAD" , result);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyseOne moodAnalyse=new MoodAnalyseOne();
        String result=moodAnalyse.analyzeMood("I am in happy mood");
        Assert.assertEquals("HAPPY" , result);
    }

}
