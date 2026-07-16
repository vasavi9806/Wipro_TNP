import java.util.HashSet;

public class CountryHashSet {

    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {

        for (String country : H1) {
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        CountryHashSet obj = new CountryHashSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Australia");

        System.out.println("Countries : " + obj.H1);

        System.out.println("Search : " + obj.getCountry("Japan"));
        System.out.println("Search : " + obj.getCountry("China"));
    }
}