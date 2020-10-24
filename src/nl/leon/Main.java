package nl.leon;

import nl.leon.tournament.*;

import java.util.Arrays;

/*
 Continue working from last week’s project
- Write a method in Game that decide what team is winning the game and store that in score
- Write a method in Round that randomly assigns teams to games and plays the game (calls the method you wrote in Game)
- Write a method in Tournament that runs all the rounds and gives the winners of a certain round as input for the next round

 */


public class Main {

    public static void main(String[] args) {
	// write your code here
//        createShortTeam();
//        createLongTeam();

        Tournament tournament = new Tournament();

        System.out.println(tournament.toString());

        for (Team team: tournament.getTeams()) {
            System.out.println(team.getName());
        }

        for (Round round: tournament.getRounds()) {
            System.out.println(round.getRoundNumber());


            round.start();

            for (Game game : round.getGames()) {
                System.out.println(game.toString());
            }
        }
    }

}
