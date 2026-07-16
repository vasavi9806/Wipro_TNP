import java.util.*;

class Card {

    private char symbol;
    private int number;

    Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }
}

public class CardCollection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Character, Card> map = new TreeMap<>();

        int totalCards = 0;

        while (map.size() < 4) {

            System.out.println("Enter a card");

            char symbol = sc.next().charAt(0);

            int number = sc.nextInt();

            totalCards++;

            if (!map.containsKey(symbol)) {
                map.put(symbol, new Card(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in " + totalCards + " cards");

        System.out.println("Cards in Set are :");

        for (Card c : map.values()) {
            System.out.println(c.getSymbol() + " " + c.getNumber());
        }

        sc.close();
    }
}