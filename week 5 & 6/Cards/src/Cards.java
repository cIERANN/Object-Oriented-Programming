class Card {
    String suit;
    String faceValue;

    Card(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }
}

public class Cards {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] faceValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        Card[] deck = new Card[52];
        int index = 0;
        for (String suit : suits) {
            for (String faceValue : faceValues) {
                deck[index++] = new Card(suit, faceValue);
            }
        }

        
        for (int i = 0; i < 52; i++) {
            int randomIndex = i + (int) (Math.random() * (52 - i));
            Card temp = deck[randomIndex];
            deck[randomIndex] = deck[i];
            deck[i] = temp;
        }

       
        System.out.println("Dealt cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck[i]);
        }
    }
}

