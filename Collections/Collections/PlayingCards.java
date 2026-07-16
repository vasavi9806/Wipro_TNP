import java.util.*;

class Card {
    char symbol;
    int number;

    Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
}

public class PlayingCards {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Character, ArrayList<Card>> map = new TreeMap<>();

        System.out.print("Enter Number of Cards : ");
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

        System.out.println("Distinct Symbols are :");

        for (char ch : map.keySet()) {
            System.out.print(ch + " ");
        }

        System.out.println();

        for (char ch : map.keySet()) {

            ArrayList<Card> list = map.get(ch);

            System.out.println("Cards in " + ch + " Symbol");

            int sum = 0;

            for (Card c : list) {
                System.out.println(c.symbol + " " + c.number);
                sum += c.number;
            }

            System.out.println("Number of cards : " + list.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}