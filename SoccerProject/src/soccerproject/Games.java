/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerproject;

import java.util.Random;

/**
 *
 * @author saer1
 */
public class Games {

    private Teams t1;
    private Teams t2;
    private int temp;
    private int id;
    private int t1Scores;
    private int t2Scores;

    public Games(Teams t1, Teams t2, int temp, Random rnd, int id) {
        this.t1 = t1;
        this.t2 = t2;
        this.temp = temp;
        this.id = id;
        t1Scores = rnd.nextInt(1 + this.temp / 5);
        t2Scores = rnd.nextInt(1 + this.temp / 5);
        t1.setGoals_scored(t1.getGoals_conceded() + t1Scores);
        t1.setGoals_conceded(t1.getGoals_conceded() + t2Scores);

        if (t1Scores > t2Scores) { //Home Team wins
            t1.setWin_total(t1.getWin_total() + 1);
            t2.setLoss_total(t2.getLoss_total() + 1);

        } else if (t1Scores == t2Scores) { //Tie between Home & Away Team
            t2.setTie_total(t2.getTie_total() + 1);

        } else {
            t2.setWin_total(t2.getWin_total() + 1); //Away Team wins
            t1.setLoss_total(t1.getLoss_total() + 1);
        }

    }

    public Teams getT1() {
        return t1;
    }

    public void setT1(Teams t1) {
        this.t1 = t1;
    }

    public Teams getT2() {
        return t2;
    }

    public void setT2(Teams t2) {
        this.t2 = t2;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getT1scores() {
        return t1Scores;
    }

    public void setT1scores(int t1scores) {
        this.t1Scores = t1scores;
    }

    public int getT2scores() {
        return t2Scores;
    }

    public void setT2scores(int t2scores) {
        this.t2Scores = t2scores;
    }

}
