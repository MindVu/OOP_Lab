package hust.soict.ict.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{
    // public String title;
    // public String category;
    // public String director;
    // public int length;
    // public float cost;
    // private static int nbDigitalVideoDiscs = 0;
    // public int id;

    // public DigitalVideoDisc(String title) {
    //     this.title = title;
    //     nbDigitalVideoDiscs++;
    //     this.id = nbDigitalVideoDiscs;
    // }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    // public DigitalVideoDisc(String title, String category, float cost) {
    //     this.title = title;
    //     this.category = category;
    //     this.cost = cost;
    //     nbDigitalVideoDiscs++;
    //     this.id = nbDigitalVideoDiscs;
    // }

    // public int getId() {
    //     return id;
    // }

    // public String getTitle() {
    //     return title;
    // }

    // public String getCategory() {
    //     return category;
    // }

    // public String getDirector() {
    //     return director;
    // }

    // public float getCost() {
    //     return cost;
    // }

    // public int getLength() {
    //     return length;
    // }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public void setCategory(String category) {
    //     this.category = category;
    // }

    // public void setDirector(String director) {
    //     this.director = director;
    // }

    // public void setCost(float cost) {
    //     this.cost = cost;
    // }

    // public void setLength(int length) {
    //     this.length = length;
    // }
    @Override
    public String toString()
    {
        return  this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector()
                + " - " + this.getLength() + ": " + this.getCost() + "$";
    }

    public boolean isMatch(String title) {
        return this.getTitle().equals(title);
    }

    @Override
    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD Length: " + this.getLength());
    }
}
