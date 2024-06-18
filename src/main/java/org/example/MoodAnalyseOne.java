package org.example;

public class MoodAnalyseOne {

    private String message;

    public MoodAnalyseOne() {

    }

    public MoodAnalyseOne(String message) throws  MoodAnalyzerException {
        this.message = message;
    }

    public  void analyzeMood(String message) throws MoodAnalyzerException{
        this.message=message;
        analyzeMood();
    }

    public String analyzeMood() throws MoodAnalyzerException {
        try {

            if (message.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }

        }
        catch (NullPointerException e) {
            throw new MoodAnalyzerException("enter the valid input");
        }
    }
}

