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

        for (int x = 0; x < teamsList.length; x++) {
            teamsList[x] = new Teams("Team " + (x + 1));
        }

        int coldCounter = 0;
        int idCounter = 1;
        while (coldCounter < 3) {
            System.out.println("Choose the temperature...");
            int temp = in.nextInt();
            if (temp > 0) {
                coldCounter = 0;

                ArrayList<Integer> valueList = new ArrayList<>();
                for (int x = 0; x < 4; x++) {
                    valueList.add(x);
                }

                int team1 = valueList.remove(rnd.nextInt(valueList.size()));
                int team2 = valueList.remove(rnd.nextInt(valueList.size()));
                int team3 = valueList.remove(rnd.nextInt(valueList.size()));
                int team4 = valueList.remove(0);
                Games g1 = new Games(teamsList[team1], teamsList[team2], temp, rnd, idCounter++);
                teamsList[team1] = g1.getT1();
                teamsList[team1] = g1.getT1();
                Games g2 = new Games(teamsList[team3], teamsList[team4], temp, rnd, idCounter++);
                gamesList.add(g1);
                gamesList.add(g2);
            } else {
                coldCounter++;
                System.out.println("It is too cold to play."
                        + System.lineSeparator());
            }

        }

        System.out.println("Statistics");
        System.out.println("----------");//divider
        for (Teams x : teamsList) {
            System.out.println("Team Name: " + x.getName());
            System.out.println("Wins: " + x.getWin_total() + ", Losses: " + x.getLoss_total() + ", Ties: " + x.getTie_total());
            System.out.println("Goals scored: " + x.getGoals_scored() + ", Goals conceded: " + x.getGoals_conceded()
                    + System.lineSeparator());
        }

        int hottest = 0;
        int average = 0;
        for (Games g : gamesList) {
            System.out.println("Game: " + g.getId());
            System.out.println("Temperature: " + g.getTemp());
            System.out.println("Home Team: " + g.getT1().getName() + ", " + g.getT1scores());
            System.out.println("Away Team: " + g.getT2().getName() + ", " + g.getT2scores()
                    + System.lineSeparator());

            average += g.getTemp();

            if (hottest < g.getTemp()) {
                hottest = g.getTemp();
            }

        }

        average = average / gamesList.size();
        System.out.printf("Hottest temperature: %d  |  ", hottest);//the line is a divider
        System.out.printf("Average temperature: %d ", average);
    }

}
