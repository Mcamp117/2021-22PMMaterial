public class Books {
    //title, author, rating
    String title;
    String author;
    int rating;
    //constructor(title,author)
    public Books(){
        title="Book 1";
        author="Bob John III";
        rating=1;
        System.out.println("Object Created");
    }

    public Books(String t, String a){
        title=t;
        author=a;
    }
    //getters and setters
    public void setTitle(String t){
        //python was self.title = t;
        //this object's title is now t
        this.title = t;
    }

    public void setAuthor(String a){
        this.author = a;
    }

    public void setRating(int r){
        this.rating = r;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getRating(){
        return rating;
    }
    //create 1 object of the Book class in MediaPlayer
    //  set the title, author
    //  get the title, author
}
