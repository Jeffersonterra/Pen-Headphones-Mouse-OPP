package phoneCompany;

public class Main {
    public static void main(String[] args) {
        iphone apple = new iphone();
        motorolla moto = new motorolla();
        sansung sansung = new sansung();
        smartphone smart = new smartphone();
        iphone.makeCall();
        motorolla.makeCall();
        sansung.makeCall();
    }
}
