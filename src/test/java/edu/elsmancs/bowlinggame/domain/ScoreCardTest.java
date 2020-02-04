package edu.elsmancs.bowlinggame.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class ScoreCardTest {

    @Test
    public void obtenerScoreCard(){
        ScoreCard scorecard = new ScoreCard("12345123451234512345");
        assertEquals("12345123451234512345", scorecard.getGameScore());
    }

    @Test
    public void toIntTest() {
        ScoreCard scorecard = new ScoreCard("1");
        assertEquals(1, scorecard.toInt(), 0);
    }

}
