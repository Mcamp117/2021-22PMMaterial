public class Whale extends Fish implements Swimming{
    public Whale(){
        super("Moby Dick","big");
    }
    public Whale(String name, String desc){
        super(name,desc);
    }
    public String swim(){
        return "Swimming and blowing it's nose";
    }
}
