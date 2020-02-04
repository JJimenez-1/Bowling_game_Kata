package edu.elsmancs.bowlinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {

    private final String score;
    public List<ScoreCard> scoreCards = new ArrayList<>();
    public List<ScoreCard> getScoreCards();

    public ScoreCard(String score) {
        this.score = score;
    }

    String getGameScore() {
        return this.score;
    }


    int toInt() {
        int number = Integer.parseInt(score);
            return number;
    }
}
