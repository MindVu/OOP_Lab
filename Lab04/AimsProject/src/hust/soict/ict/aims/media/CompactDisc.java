package hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("The author exists already");
        } else {
            tracks.add(track);
            System.out.println("The author has been added");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            this.tracks.remove(track);
            System.out.println("The author has been removed");
        } else {
            System.out.println("The author does not exist");
        }
    }
    @Override
    public int getLength() {
        int sum = 0;
        for (Track t : tracks) {
            sum += t.getLength();
        }
        return sum;
    }
    @Override
    public void play() {
        for (Track t : tracks) {
            t.play();
        }
    }
}
