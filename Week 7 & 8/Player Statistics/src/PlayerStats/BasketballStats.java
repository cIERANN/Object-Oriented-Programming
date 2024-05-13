package PlayerStats;

public class BasketballStats extends PlayerStats {
    private int assists;


    public BasketballStats(String playerName, int gamesPlayed, int pointsScored, int assists) {
        super(playerName, gamesPlayed, pointsScored);
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


