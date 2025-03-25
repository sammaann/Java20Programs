interface MusicInstrument {
    void play(); // Abstract method
}

class Guitar implements MusicInstrument {
    public void play() {
        System.out.println("Guitar is playing: Strum Strum 🎸");
    }
}

class Piano implements MusicInstrument {
    public void play() {
        System.out.println("Piano is playing: Melody Melody 🎹");
    }
}

public class Music {
    public static void main(String[] args) {
        // Using polymorphism
        MusicInstrument instrument1 = new Guitar();
        MusicInstrument instrument2 = new Piano();

        instrument1.play();
        instrument2.play();
    }
}
