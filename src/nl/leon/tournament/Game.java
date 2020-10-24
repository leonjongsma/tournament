package nl.leon.tournament;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author : Leon Jongsma
 */
public class Game {
    // home team


    public Game(Team homeTeam, Team outTeam) {
        this.homeTeam = homeTeam;
        this.outTeam = outTeam;
        start();
    }

    private Team homeTeam;
    // out team
    private Team outTeam;
    // referee
    private Referee referee;
    // time
    private LocalDateTime time;
    // date
    private LocalDate date;
    // stadium name;
    private String stadiumName;
    // score
    private Score score;


    /*  start the game and decide what team wins.


    - Write a method in Game that decide what team is winning the game and store that in score

     */
    private void start() {
        this.score = generateScore(this);
    }

    private Score generateScore(Game game) {
        Score score = new Score();
        score.setPointsForHomeTeam(generateRandomNumberBetweenNullandFive());
        score.setPointsForOutTeam(generateRandomNumberBetweenNullandFive());
        return score;
    }

    private int generateRandomNumberBetweenNullandFive() {
        return new Random().ints(1, 0, 6).findFirst().getAsInt();
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getOutTeam() {
        return outTeam;
    }

    public void setOutTeam(Team outTeam) {
        this.outTeam = outTeam;
    }

    public Referee getReferee() {
        return referee;
    }

    public void setReferee(Referee referee) {
        this.referee = referee;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Game{" +
                "homeTeam=" + homeTeam +
                ", outTeam=" + outTeam +
                ", score=" + score +
                '}';
    }
}
