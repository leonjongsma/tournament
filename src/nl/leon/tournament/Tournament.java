package nl.leon.tournament;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

/**
 * @author : Leon Jongsma
 */
public class Tournament {

    private static final String DATA_FOR_RANDOM_STRING = "abcdefghijklmnopqrstuvwxyz";

    private Team[] teams;
    private Round[] rounds;

    public Tournament() {
        this(16,18);
    }

    public Tournament(int amountTeams, int amountRounds) {
        teams = new Team[amountTeams];
        rounds = new Round[amountRounds];
        teams = createRandomTeams(teams);
        rounds = createRounds(rounds,teams);
        // in tournament we decide what teams we use.
    }

    private Round[] createRounds(Round[] rounds, Team[] teams) {

        for(int i=0;i<rounds.length;i++){
            rounds[i] = new Round(i,teams);
        }
        return rounds;
    }

    private Team[] createRandomTeams(Team[] teams) {

        for(int i=0;i<teams.length;i++){
            teams[i] = new Team(generateRandomString(10));
        }
        return teams;
    }

    public static String generateRandomString(int length) {

        Random random = new Random();
        if (length < 1) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);
            sb.append(rndChar);
        }
        return sb.toString();
    }


    public String games;

    public Team winner;
    public Team loser;
    public LocalDate startDate;
    public LocalDate endDate;
    public String place;


    @Override
    public String toString() {
        return "Tournament{" +
                "teams=" + Arrays.toString(teams) +
                ", games='" + games + '\'' +
                ", rounds='" + rounds + '\'' +
                ", winner=" + winner +
                ", loser=" + loser +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", place='" + place + '\'' +
                '}';
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public Round[] getRounds() {
        return rounds;
    }

    public void setRounds(Round[] rounds) {
        this.rounds = rounds;
    }
}
