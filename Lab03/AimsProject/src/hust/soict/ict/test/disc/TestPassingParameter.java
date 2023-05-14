package hust.soict.ict.test.disc;
import hust.soict.ict.aims.disc.DigitalVideoDisc;

class Wrapper {
    DigitalVideoDisc d;

    public Wrapper(DigitalVideoDisc d) {
        this.d = d;
    }
}

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        Wrapper d1 = new Wrapper(jungleDVD);
        Wrapper d2 = new Wrapper(cinderellaDVD);
        swap(d1, d2);
        System.out.println("jungle dvd title: " + d1.d.getTitle());
        System.out.println("cinderella dvd title: " + d2.d.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Wrapper d1, Wrapper d2) {
        DigitalVideoDisc tmp = d1.d;
        d1.d = d2.d;
        d2.d = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
