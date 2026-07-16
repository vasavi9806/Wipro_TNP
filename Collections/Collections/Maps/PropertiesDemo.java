import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties p = new Properties();

        p.put("Andhra Pradesh", "Amaravati");
        p.put("Telangana", "Hyderabad");
        p.put("Karnataka", "Bengaluru");
        p.put("Tamil Nadu", "Chennai");
        p.put("Kerala", "Thiruvananthapuram");

        Iterator<Map.Entry<Object, Object>> it =
                p.entrySet().iterator();

        System.out.println("States and Capitals");

        while (it.hasNext()) {

            Map.Entry<Object, Object> entry = it.next();

            System.out.println(entry.getKey()
                    + " -> "
                    + entry.getValue());

        }

    }
}