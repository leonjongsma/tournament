package nl.leon;

import nl.leon.tournament.Coach;
import nl.leon.tournament.Color;
import nl.leon.tournament.Team;
import nl.leon.tournament.Tournament;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        createShortTeam();
        createLongTeam();

        Color.stream().forEach(System.out::println);


        Tournament tournament = new Tournament();

        Team team1  = new Team();
        Team team2 = new Team();



        Arrays.of

        tournament.winner = new Team();
    }


    private static void createShortTeam() {

        Team team = new Team();
        team.setName("Barcelona");
        team.setBenchStrength(10);
        team.setCoach(new Coach("Leon"));
        team.setColor(Color.BLUE);
        team.setPlayers("Player7,Player6,Player1,Player2,Player3,Player4,Player5,");
        System.out.println(team.toString());
        System.out.println(team.showTeamName());



    }

    private static void createLongTeam() {

        Team team = new Team();
        team.setName("FC Groningen");
        team.setBenchStrength(10);
        team.setCoach(new Coach("Leon"));
        team.setColor(Color.BLUE);
        team.setPlayers("Player7,Player6,Player1,Player2,Player3,Player4,Player5,");


        System.out.println(team.toString());
        System.out.println(team.showTeamName());
    }




}
