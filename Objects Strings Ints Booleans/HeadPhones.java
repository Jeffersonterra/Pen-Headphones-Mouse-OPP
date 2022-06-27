package aopppen;

public class HeadPhones extends Main {
    String charge = "Micro usb";
    String[] controls = { "power", "volume", "skip", "play/pause" };
    String color = "Red/Black";
    static boolean power = false;
    static int volume = 0;
    static boolean playPause = false;

    public static void powerOn() {
        power = true;
    }

    public static void powerOff() {
        power = false;
    }

    public static void volumeUp() {
        volume++;
    }

    public static void volumeDown() {
        volume--;
    }

    public static void playPause() {
        if (playPause == true) {
            playPause = false;
        } else {
            playPause = true;
        }

    };
}
