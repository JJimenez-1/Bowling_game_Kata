package edu.elsmancs.bowlinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {

    private String score = "";
    ScoreCard(String puntuacion) { this.score = puntuacion; }


    public String getGameScore() {
        return this.score;
    }

    public int FinalScore() {
        int puntuacion = 0;
        for (int roll = 0; roll < (getGameScore().length()); roll++) {
            char rollChar = getGameScore().charAt(roll);
            if (rollChar == '-') {
                puntuacion += 0;
            }
            else {
                puntuacion += Character.getNumericValue(rollChar);
            }
        }
        return puntuacion;
    }
}
