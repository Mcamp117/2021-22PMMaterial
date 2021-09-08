public class MediaPlayer {
    public static void main(String[] args) {
        //Song s1 = new Song();
        
        //call the parameters
        //System.out.println(s1.title);
        //System.out.println(s1.artist);

        // Song s2 = new Song("funkytown","lipps inc");
        // System.out.println(s2.title);
        // System.out.println(s2.artist);

        // Song s3 = new Song("creature","half alive");
        // System.out.println(s3.title);
        // System.out.println(s3.artist);

        // s3.setTitle("song2"); //correct way to reset a variable
        // System.out.println(s3.title);
        // s3.title="too steep";   //not correct way to reset a variable
        // System.out.println(s3.title);

        //System.out.println(s1.getTitle()); //correct way to obtain parameters 
        //System.out.println(s1.getArtist()); //correct way to obtain parameters 
        //System.out.println(s1.getRating()); //correct way to obtain parameters
        
        Books b1= new Books();
        System.out.println(b1.title);
        System.out.println(b1.author);

        System.out.println(b1.getTitle()); 
        System.out.println(b1.getAuthor());
        System.out.println(b1.getRating());
    }
}
