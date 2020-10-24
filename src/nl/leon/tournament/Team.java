package nl.leon.tournament;

/**
 * @author : Leon Jongsma
 */
public class Team {

    @Override
    public String toString() {
        return "Team{" +
                "players='" + players + '\'' +
                ", name='" + name + '\'' +
                ", coach=" + coach +
                ", ranking=" + ranking +
                ", color=" + color +
                ", nrOfTournamentsPlayed=" + nrOfTournamentsPlayed +
                ", benchStrength=" + benchStrength +
                '}';
    }

    // players
    String players;
    // name
    String name;
    // coach
    Coach coach;
    // ranking
    int ranking;
    // color
    Color color;
    // number of tournaments played
    int nrOfTournamentsPlayed;
    // bench strength
    int benchStrength;


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
