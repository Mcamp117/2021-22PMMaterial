import java.nio.file.WatchEvent;

public class Yellow extends Bird implements Flying,Swimming{
    public Yellow(){
        super("Yellow","zoom");
    }
    public Yellow(String name,String desc){
        super(name,desc);
    } 
    public String fly(){
        return "Dashes in the air";
    }
    public String swim(){
        return "Dashes in the water";
    }
}
