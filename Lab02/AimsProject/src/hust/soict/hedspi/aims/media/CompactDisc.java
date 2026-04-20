package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
        super(title, category, cost, length, director);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track '" + track.getTitle() + "' has been added to the CD.");
        } else {
            System.out.println("Track '" + track.getTitle() + "' is already in the CD.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track '" + track.getTitle() + "' has been removed from the CD.");
        } else {
            System.out.println("Track '" + track.getTitle() + "' is not present in the CD.");
        }
    }
    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle() + " by " + this.getArtist());
        System.out.println("CD total length: " + this.getLength());
        System.out.println("--- Tracks in CD ---");
        for (Track track : tracks) {
            track.play();
        }
    }
    @Override
    public String toString() {
        return "CD - [" + this.getTitle() + "] - [" + this.getCategory() + "] - [" + this.getDirector() + "] - [" + this.getArtist() + "] - [" + this.getLength() + " mins]: " + this.getCost() + " $";
    }
}