package PlayerStats;

public class VolleyballStats extends PlayerStats {
    private int attacks;


    public VolleyballStats(String playerName, int gamesPlayed, int pointsScored, int attacks) {
        super(playerName, gamesPlayed, pointsScored);
        this.attacks = attacks;
    }


    public int getAttacks() {
        return attacks;
    }

    public void setAttacks(int attacks) {
        this.attacks = attacks;
    }


    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Attacks: " + attacks);
    }
}
