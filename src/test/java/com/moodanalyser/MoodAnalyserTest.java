package com.moodanalyser;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Sad Message");
        Assert.assertEquals("SAD",  mood);
    }
}
