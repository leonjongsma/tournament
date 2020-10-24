package nl.leon.tournament;


import java.util.Random;

/**
 * @author : Leon Jongsma
 */
public class Round {

    private Team[] teams;
    private int roundNumber;

    private Game[] games;


    public void start() {
        Game game = new Game(teams[getRandomTeam()], teams[getRandomTeam()]);
        games = new Game[teams.length / 2];
        for (int i = 0; i < games.length; i++) {
            games[i] = new Game(teams[getRandomTeam()], teams[getRandomTeam()]);
        }
    }

    private int getRandomTeam() {
        Random random = new Random();
        return random.nextInt(teams.length);
    }


    // every round consist of

    public Round(int roundNumber, Team[] teams) {
        this.roundNumber = roundNumber;
        this.teams = teams;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }
}
