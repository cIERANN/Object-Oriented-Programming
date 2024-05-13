package PlayerStats;

public class FootballStats extends PlayerStats {
    private int assists;


    public FootballStats(String playerName, int gamesPlayed, int goalsScored, int assists) {
        super(playerName, gamesPlayed, goalsScored);
        this.assists = assists;
    }


    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }


    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Assists: " + assists);
    }
}