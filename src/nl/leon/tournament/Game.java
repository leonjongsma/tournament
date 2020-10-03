package nl.leon.tournament;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author : Leon Jongsma
 */
public class Game {
    // home team
    Team homeTeam;
    // out team
    Team outTeam;
    // referee
    Referee referee;
    // time
    LocalDateTime time;
    // date
    LocalDate date;
    // stadium name;
    String stadiumName;
    // score
    Score score;

}
