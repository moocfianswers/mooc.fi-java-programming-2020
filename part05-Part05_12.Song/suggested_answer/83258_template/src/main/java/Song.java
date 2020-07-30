
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public boolean equals(Object compared) {
        // if the variables exist in the same place, then they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not and instance of Song, 
        // then the objects are not equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // let's cast the object to type Song
        Song verrattavaKappale = (Song) compared;
        
        // if the values of object variables for the two objects are equal, them the objects are equal
        if (this.artist.equals(verrattavaKappale.artist)
                && this.name.equals(verrattavaKappale.name)
                && this.durationInSeconds == verrattavaKappale.durationInSeconds) {
            return true;
        }

        // otherwise they are not equal
        return false;
    }

}
