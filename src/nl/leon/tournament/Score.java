package nl.leon.tournament;

/**
 * @author : Leon Jongsma
 */
class Score {

    // points for home team
    private int pointsForHomeTeam;
    // points for out team
    private int pointsForOutTeam;
    // players that scored for home team
    String playersThatScoredForHomeTeam;
    // players that scored for out team
    String playersThatScoredForOutTeam;


    public int getPointsForHomeTeam() {
        return pointsForHomeTeam;
    }

    public void setPointsForHomeTeam(int pointsForHomeTeam) {
        this.pointsForHomeTeam = pointsForHomeTeam;
    }

    public int getPointsForOutTeam() {
        return pointsForOutTeam;
    }

    public void setPointsForOutTeam(int pointsForOutTeam) {
        this.pointsForOutTeam = pointsForOutTeam;
    }

    public String getPlayersThatScoredForHomeTeam() {
        return playersThatScoredForHomeTeam;
    }

    public void setPlayersThatScoredForHomeTeam(String playersThatScoredForHomeTeam) {
        this.playersThatScoredForHomeTeam = playersThatScoredForHomeTeam;
    }

    public String getPlayersThatScoredForOutTeam() {
        return playersThatScoredForOutTeam;
    }

    public void setPlayersThatScoredForOutTeam(String playersThatScoredForOutTeam) {
        this.playersThatScoredForOutTeam = playersThatScoredForOutTeam;
    }

    @Override
    public String toString() {
        return "Score{" +
                "pointsForHomeTeam=" + pointsForHomeTeam +
                ", pointsForOutTeam=" + pointsForOutTeam +
                '}';
    }
}
