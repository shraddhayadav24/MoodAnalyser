package org.example;

public class MoodAnalyseOne {
    public String analyzeMood(String message) {
        if (message.contains("sad")) {
            return "SAD";
        }
        else {
            return "Happy";
        }

    }
}
