package org.example;

public class MoodAnalyseOne {

    private String message;

    public  MoodAnalyseOne(){

    }

    public MoodAnalyseOne(String message){
        this.message=message;
    }

    public String analyzeMood() {

        if (message.contains("sad")) {
            return "SAD";
        }
        else {
            return "HAPPY";
        }

    }
}
