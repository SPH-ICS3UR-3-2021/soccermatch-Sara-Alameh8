/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerproject;

import java.util.*;

/**
 *
 * @author saer1
 */
public class SoccerProject {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        Teams[] teamsList = new Teams[4];
        ArrayList<Games> gamesList = new ArrayList<>();
        
        for (int x = 1; x < teamsList.length; x++) {
            teamsList[x] = new Teams("Team " + (x + 1));
        }

        int coldCounter = 0;
        int idCounter = 1;
        while (coldCounter < 3) {
            System.out.println("Choose the temperature...");
            int temp = in.nextInt();
            if (temp > 0) {
                coldCounter = 0;
                //divider
                ArrayList<Integer> valueList = new ArrayList<>();
                for (int x = 0; x < 4; x++) {
                    valueList.add(x);
                }

                int team1 = valueList.remove(rnd.nextInt(valueList.size()));
                int team2 = valueList.remove(rnd.nextInt(valueList.size()));
                int team3 = valueList.remove(rnd.nextInt(valueList.size()));
                int team4 = valueList.remove(0);
                Games g1 = new Games(teamsList[team1], teamsList[team2], rnd, idCounter++);
                Games g2 = new Games(teamsList[team3], teamsList[team4], rnd, idCounter++);
                gamesList.add(g1);
                gamesList.add(g2);

            } else {
                coldCounter++;
                System.out.println("Too cold to play");
            }

        }
        //print statistics
        //loop through the game Arraylist to get all the facts
        System.out.println("Stats");
        for (Teams x : teamsList) {
            System.out.println("Team Name: " + x.getName());
        }

        for (Games g : gamesList) {
            System.out.println("Game " + g.getId() + " between " + g.getT1().getName() + " and " + g.getT2().getName());
            
        }

    }

}
