package prac2.POKER;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();
        if (n < 2 || n > 10) {
            System.out.println("The number of players must be between 2 and 10.");
            return;
        }
        List<String> deck = createDeck();
        Collections.shuffle(deck);
        dealCards(deck, n);
    }
    public static List<String> createDeck(){
        List<String> deck = new ArrayList<>();
        for (String suit : suits){
            for (String rank : ranks){
                deck.add(suit + " of " + rank);
            }
        }
        return deck;
    }
    public static void dealCards(List<String> deck, int players){
        int cardsPerPlayer = 5;
        for (int i = 0; i < players; i++){
            System.out.println("Player " + (i + 1) + "'s hand:");
            for (int j = 0; j < cardsPerPlayer; j++){
                System.out.println(deck.remove(0));
            }
        }
        System.out.println();
    }
}
