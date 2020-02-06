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
    public void sumTotal() {
        ScoreCard scorecard = new ScoreCard("12345123451234512345");
        assertEquals(60, scorecard.FinalScore(), 0);
    }

    @Test
    public void sumTotalWith0() {
        ScoreCard scorecard = new ScoreCard("9-9-9-9-9-9-9-9-9-9-");
        assertEquals(90, scorecard.FinalScore(),0 );
    }


}
