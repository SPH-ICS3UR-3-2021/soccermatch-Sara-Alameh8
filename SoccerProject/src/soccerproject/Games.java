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
    private int t1score;
    private int t2score;
   
    public Games(Teams t1, Teams t2, Random rnd, int id) {
        this.t1 = t1;
        this.t2 = t2;
        this.id = id;   
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

    public int getT1score() {
        return t1score;
    }

    public void setT1score(int t1score) {
        this.t1score = t1score;
    }

    public int getT2score() {
        return t2score;
    }

    public void setT2score(int t2score) {
        this.t2score = t2score;
    }
     
    
}
