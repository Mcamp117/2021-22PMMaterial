public class Fish extends Animal{
    public Fish(){
        super("fish","swim");
    }
    public Fish(String name, String desc){
        super(name,desc);
    }
    @Override
    public String makeNoise(){
        return("I am a fish");
    }
}
