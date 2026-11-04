package part15;

public class InClass {
    public static void main(String[] args) {
        // Creates two speakers
        Speaker speaker1 = new Speaker();
        Speaker speaker2 = new Speaker();

        // Raises the first speaker's volume twice
        speaker1.louder();
        speaker1.louder();

        // Mutes the second speaker
        speaker2.mute();

        // Describes both speakers
        speaker1.describe();
        speaker2.describe();

        // Prints the maximum volume
        System.out.println("Max volume: " + speaker1.MAX_VOLUME);
    }
}

class Speaker {
    // Sets the maximum volume
    final int MAX_VOLUME = 10;
    // Stores the brand
    String brand = "JBL";
    // Stores the current volume
    int volume = 5;

    // Raises the volume
    void louder() {
        volume++;
    }

    // Mutes the speaker
    void mute() {
        volume = 0;
    }

    // Prints the speaker information
    void describe() {
        System.out.println(brand + " speaker at volume " + volume);
    }
}