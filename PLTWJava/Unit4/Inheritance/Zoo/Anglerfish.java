public class Anglerfish extends Fish implements Swimming{
    public Anglerfish(){
        super("Boo","scary");
    }
    public Anglerfish(String name, String desc){
        super(name,desc);
    }
    public String swim(){
        return "Swim towards the light";
    }
    @Override
    public String makeNoise(){
        return "beep";
    }
}
