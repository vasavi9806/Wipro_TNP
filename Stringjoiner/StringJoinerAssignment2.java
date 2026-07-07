import java.util.StringJoiner;

public class StringJoinerAssignment2 {
    public static void main(String[] args) {
        // Create first StringJoiner
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Tokyo");
        s1.add("New York");

        // Create second StringJoiner
        StringJoiner s2 = new StringJoiner("-");
        s2.add("London");
        s2.add("Paris");

        // We use copy objects to show both cases without altering the originals permanently
        StringJoiner case1 = new StringJoiner("-").add("Tokyo").add("New York");
        StringJoiner case2 = new StringJoiner("-").add("London").add("Paris");

        // i) s1 merged to s2 (s2 receives s1)
        case2.merge(s1);
        System.out.println("i) s1 merged to s2: " + case2.toString()); 
        // Output: London-Paris-Tokyo-New York

        // ii) s2 merged to s1 (s1 receives s2)
        case1.merge(s2);
        System.out.println("ii) s2 merged to s1: " + case1.toString()); 
        // Output: Tokyo-New York-London-Paris
    }
}