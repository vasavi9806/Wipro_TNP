
abstract class Compartment {
    public abstract String notice();
}


class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "Notice: This is a First Class compartment. Please ensure you have a valid premium ticket.";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Notice: This compartment is reserved strictly for Ladies.";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "Notice: General compartment. Open for all valid ticket holders.";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Notice: Luggage compartment. Only goods and luggage are allowed here.";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        for (int i = 0; i < compartments.length; i++) {
            int randomNum = (int) (Math.random() * 4) + 1;
            
            switch (randomNum) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + " -> " + compartments[i].notice());
        }
    }
}