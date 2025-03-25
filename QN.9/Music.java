// Interface for MusicInstrument
interface MusicInstrument {
    void play(); // Abstract method
}

// Guitar class implementing MusicInstrument
class Guitar implements MusicInstrument {
    public void play() {
        System.out.println("Guitar is playing: Strum Strum 🎸");
    }
}

// Piano class implementing MusicInstrument
class Piano implements MusicInstrument {
    public void play() {
        System.out.println("Piano is playing: Melody Melody 🎹");
    }
}

// Main class to demonstrate runtime polymorphism
public class Music {
    public static void main(String[] args) {
        // Using polymorphism
        MusicInstrument instrument1 = new Guitar();
        MusicInstrument instrument2 = new Piano();

        // Playing instruments dynamically
        instrument1.play();
        instrument2.play();
    }
}
