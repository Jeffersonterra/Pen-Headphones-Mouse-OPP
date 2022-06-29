package mousecompany;

public class Main {
    public static void main(String[] args) {
        mouse1 m1 = new mouse1();
        mouse2 m2 = new mouse2();
        mouse3 m3 = new mouse3();
        trackpad track = new Trackpad();
        m1.ScrollUP();
        m1.rightClick();
        m2.ScrollDOWN();
        m2.leftClick();
        m2.connect();
        System.out.println(m3.ambidextrous);
        trackpad.move();
        
    }
}
