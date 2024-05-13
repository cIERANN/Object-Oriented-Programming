package PlayerStats;

public class PlayerStats {
    private String playerName;
    private int gamesPlayed;
    private int goalsScored;

    // Constructor
    public PlayerStats(String playerName, int gamesPlayed, int goalsScored) {
        this.playerName = playerName;
        this.gamesPlayed = gamesPlayed;
        this.goalsScored = goalsScored;
    }

    // Getters and setters
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    // Method to display player stats
    public void displayStats() {
        System.out.println("Player: " + playerName);
        System.out.println("Games Played: " + gamesPlayed);
        System.out.println("Goals Scored: " + goalsScored);
    }
}