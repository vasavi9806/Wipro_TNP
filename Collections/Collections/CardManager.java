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

public class CardManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Character, ArrayList<Card>> map = new TreeMap<>();

        System.out.print("Enter Number of Cards: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + ":");

            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            Card card = new Card(symbol, number);

            if (!map.containsKey(symbol)) {
                map.put(symbol, new ArrayList<Card>());
            }

            map.get(symbol).add(card);
        }

        System.out.println("\nDistinct Symbols are:");

        for (char symbol : map.keySet()) {

            ArrayList<Card> list = map.get(symbol);

            int sum = 0;

            for (Card c : list) {
                sum += c.getNumber();
            }

            System.out.println(symbol);
            System.out.println("Cards Count : " + list.size());
            System.out.println("Sum : " + sum);
            System.out.println("Cards :");

            for (Card c : list) {
                System.out.println(c.getSymbol() + " " + c.getNumber());
            }

            System.out.println();
        }

        sc.close();
    }
}