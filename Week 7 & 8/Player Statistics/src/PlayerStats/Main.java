package PlayerStats;

public class Main {
    public static void main(String[] args) {

        FootballStats player1 = new FootballStats("John", 10, 5, 3);
        player1.displayStats();
        System.out.println("   ");
        VolleyballStats player2 = new VolleyballStats("Alice", 15, 50, 10);
        player2.displayStats();
        System.out.println("   ");
        BasketballStats player3 = new BasketballStats("Terry", 20, 30, 5);
        player3.displayStats();
    }

}
