import java.util.*;

public class CountryTreeMap {

    TreeMap<String, String> M1 = new TreeMap<>();

    // Save Country and Capital
    public TreeMap<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    // Get Capital
    public String getCapital(String country) {
        return M1.get(country);
    }

    // Get Country
    public String getCountry(String capital) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            if (entry.getValue().equalsIgnoreCase(capital)) {
                return entry.getKey();
            }
        }

        return null;
    }

    // Reverse Map
    public TreeMap<String, String> swapKeyValue() {

        TreeMap<String, String> M2 = new TreeMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            M2.put(entry.getValue(), entry.getKey());

        }

        return M2;
    }

    // ArrayList of Countries
    public ArrayList<String> toArrayList() {

        return new ArrayList<>(M1.keySet());

    }

    public static void main(String[] args) {

        CountryTreeMap obj = new CountryTreeMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");
        obj.saveCountryCapital("Australia", "Canberra");

        System.out.println("TreeMap");
        System.out.println(obj.M1);

        System.out.println();

        System.out.println("Capital of India : "
                + obj.getCapital("India"));

        System.out.println("Country of Tokyo : "
                + obj.getCountry("Tokyo"));

        System.out.println();

        System.out.println("Reverse Map");
        System.out.println(obj.swapKeyValue());

        System.out.println();

        System.out.println("Country List");
        System.out.println(obj.toArrayList());

    }
}