package phoneCompany;

public class Phone {
    // As per default bluetooth is off to save battery
    boolean bluetooth = true;

    public static void makeCall() {
        System.out.println("Made a call!");
    }

    public static void saveContac() {
        System.out.println("Contact saved!");
    }

    public static void BluetoothON() {

        System.out.println("bluetooth ON!");
    }

    public static void BluetoothOFF() {

        System.out.println("bluetooth OFF!");
    }

    public static void BluetoothConnect() {

        System.out.println("bluetooth connected!");

        // System.out.println("Turn on bluetooth before connecting!");

    }

}
