package musicstreamingservice;

public class Song {
    private final String id;
    private final String title;
    private final String artist;
    private final String album;
    private final int duration; // can have double 5.30 mins -> something like that
    // If I want to search based on Romantic songs, then I can add song type as well, to search effectively.

    public Song(String id, String title, String artist, String album, int duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }
}
