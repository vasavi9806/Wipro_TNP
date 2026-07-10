package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        // a. Create an instance of Veena and call play() method
        System.out.println("--- Testing Veena Class ---");
        Veena veenaInstance = new Veena();
        veenaInstance.play();

        System.out.println();

        // b. Create an instance of Saxophone and call play() method
        System.out.println("--- Testing Saxophone Class ---");
        Saxophone saxophoneInstance = new Saxophone();
        saxophoneInstance.play();

        System.out.println();

        // c. Place the above instances in a variable of type Playable and then call play()
        System.out.println("--- Testing Polymorphism using Playable Interface ---");
        
        Playable playableInstrument;

        // Pointing to Veena instance
        playableInstrument = veenaInstance;
        playableInstrument.play();

        // Pointing to Saxophone instance
        playableInstrument = saxophoneInstance;
        playableInstrument.play();
    }
}