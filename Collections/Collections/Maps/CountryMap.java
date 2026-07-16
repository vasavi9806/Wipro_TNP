import java.util.*;

public class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    // Save Country and Capital
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // Get Capital using Country
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // Get Country using Capital
    public String getCountry(String capitalName) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }

        return null;
    }

    // Create Reverse Map
    public HashMap<String, String> swapKeyValue() {

        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            M2.put(entry.getValue(), entry.getKey());

        }

        return M2;
    }

    // Return ArrayList of Countries
    public ArrayList<String> toArrayList() {

        return new ArrayList<>(M1.keySet());

    }

    public static void main(String[] args) {

        CountryMap obj = new CountryMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");
        obj.saveCountryCapital("Australia", "Canberra");

        System.out.println("Map M1");
        System.out.println(obj.M1);

        System.out.println();

        System.out.println("Capital of India : "
                + obj.getCapital("India"));

        System.out.println();

        System.out.println("Country of Tokyo : "
                + obj.getCountry("Tokyo"));

        System.out.println();

        System.out.println("Map M2");
        System.out.println(obj.swapKeyValue());

        System.out.println();

        System.out.println("Countries List");
        System.out.println(obj.toArrayList());

    }
}