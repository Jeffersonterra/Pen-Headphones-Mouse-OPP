package aopppen;

public class Main {
    public static void main(String[] args) {
        pen p = new pen();
        HeadPhones h = new HeadPhones();
        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);
        System.out.println(p.clicked);
        p.click();
        System.out.println(p.clicked);
        System.out.println(h.power);
        System.out.println(h.volume);
        h.volumeUp();
        h.powerOn();
        System.out.println(h.power);
        System.out.println(h.volume);
        System.out.println(h.playPause);
        h.playPause(); /*play pause now switches between on and off*/
        System.out.println(h.playPause);
        h.playPause();
        System.out.println(h.playPause);
    }

}
