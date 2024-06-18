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
            if (message.isEmpty()){
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.EMPTY, "Enter Input");
            }

            if (message.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }

        }
        catch (NullPointerException e) {
            throw  new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.EMPTY,"Enter valid input");
        }
    }
}

