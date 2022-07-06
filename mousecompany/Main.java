package mousecompany;

public class Main {
    public static void main(String[] args) {
        mouse1 m1 = new mouse1();
        mouse2 m2 = new mouse2();
        mouse3 m3 = new mouse3();
        trackpad track = new trackpad();
        m1.ScrollUP();
        m1.rightClick();
        m2.ScrollDOWN();
        m2.leftClick();
        m2.connect();
        System.out.println("Is the mouse3 ambidextrous?");
        System.out.println(m3.ambidextrous);
        System.out.println("How does the trackpad move?");
        trackpad.move();
        System.out.println("Is the trackpad ambidextrous?");
        System.out.println(track.ambidextrous);
        System.out.println("What is the trackpad's size ? ");
        System.out.println(track.size + track.sizetipe);
        System.out.println("What is the trackpad's color ? ");
        System.out.println(track.color);

    }
}
