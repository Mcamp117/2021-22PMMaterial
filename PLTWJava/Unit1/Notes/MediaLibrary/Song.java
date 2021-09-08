public class Song {
    String title;
    String artist;
    int rating;
    double price;
    double duration;

    public Song(){
        title="unknown track";
        artist="artist unknown";
        rating=0;
        System.out.println("Object Created");
    }
    public Song(String t, String a){
        title=t;
        artist=a;
    }

    //methods
    //getters and setters or accesories and mutators
    public void setTitle(String t){
        //python was self.title = t;
        //this object's title is now t
        this.title = t;
    }

    public void setArtist(String a){
        this.artist = a;
    }

    public void setRating(int r){
        this.rating = r;
    }

    //getters- return values
    //publicSoAnyoneCanAccess DataTypeThatIsReturn functionName(){return info}
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int getRating(){
        return rating;
    }
}
