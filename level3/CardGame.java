import java.util.Arrays;
import java.util.Scanner;

public class CardGame {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        
        // Initialize the deck with rank and suit combinations
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            // Randomly select a card to swap with
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute the deck of cards to players
    public static String[][] distributeCards(String[] deck, int numOfPlayers, int cardsPerPlayer) {
        int totalCards = numOfPlayers * cardsPerPlayer;
        
        // Check if we can distribute the cards equally to all players
        if (totalCards > deck.length) {
            System.out.println("Not enough cards to distribute equally to all players.");
            return null;
        }

        String[][] playersCards = new String[numOfPlayers][cardsPerPlayer];
        int cardIndex = 0;
        
        // Distribute the cards to players
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[cardIndex++];
            }
        }
        return playersCards;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        if (playersCards == null) {
            return;
        }

        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(playersCards[i]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the deck of cards
        String[] deck = initializeDeck();
        
        // Shuffle the deck
        deck = shuffleDeck(deck);
        
        // Get user input for number of players and cards per player
        System.out.print("Enter the number of players: ");
        int numOfPlayers = scanner.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();
        
        // Distribute the cards
        String[][] playersCards = distributeCards(deck, numOfPlayers, cardsPerPlayer);
        
        // Print the players' cards
        printPlayersCards(playersCards);

        scanner.close();
    }
}
