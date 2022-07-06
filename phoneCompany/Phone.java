package phoneCompany;

public class Phone {
    // As per default bluetooth is off to save battery
    boolean bluetooth = false;

    public static void makeCall() {
        System.out.println("Made a call!");
    }

    public static void saveContac() {
        System.out.println("Contact saved!");
    }

    public void BluetoothON() {
        bluetooth = true;
        System.out.println("bluetooth ON!");
    }

    public void BluetoothOFF() {
        bluetooth = false;
        System.out.println("bluetooth OFF!");
    }

    public void BluetoothConnect() {
        if (bluetooth = true) {
            System.out.println("bluetooth connected!");

        } else {
            System.out.println("Turn on bluetooth before connecting!");

        }
    }

}
