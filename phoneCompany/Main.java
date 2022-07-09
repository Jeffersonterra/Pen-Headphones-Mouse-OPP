package phoneCompany;

public class Main {
    public static void main(String[] args) {
        iphone apple = new iphone();
        motorolla moto = new motorolla();
        sansung sansung = new sansung();
        smartphone smart = new smartphone();
        apple.makeCall();
        motorolla.makeCall();
        sansung.makeCall();
        apple.makeCall();
        apple.saveContac();
        System.out.println(moto.size);
        System.out.println(apple.screensize);
        apple.BluetoothON();
        apple.BluetoothConnect();
        aplle.Whatfone();
    }
}
