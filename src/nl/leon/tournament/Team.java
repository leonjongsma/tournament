package nl.leon.tournament;

/**
 * @author : Leon Jongsma
 */
public class Team {


    public Team() {

    }

    public Team(String teamname) {
        this.name = teamname;
    }

    @Override
    public String toString() {
        return "Team{" +
                "players='" + players + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    // players
    private String players;
    // name
    private String name;
    // coach
    private Coach coach;
    // ranking
    private int ranking;
    // color
    private Color color;
    // number of tournaments played
    private int nrOfTournamentsPlayed;
    // bench strength
    private int benchStrength;


    public String getPlayers() {
        return players;
    }


    public void setPlayers(String players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNrOfTournamentsPlayed() {
        return nrOfTournamentsPlayed;
    }

    public void setNrOfTournamentsPlayed(int nrOfTournamentsPlayed) {
        this.nrOfTournamentsPlayed = nrOfTournamentsPlayed;
    }

    public int getBenchStrength() {
        return benchStrength;
    }

    public void setBenchStrength(int benchStrength) {
        this.benchStrength = benchStrength;
    }


    public String showTeamName() {

        StringBuilder builder = new StringBuilder();
        if (this.name.length() > 10) {
            builder.append("long: ");
        } else {
            builder.append("short: ");
        }
        builder.append(name);
        System.out.println(name.toString());
        return builder.toString();

    }
}
