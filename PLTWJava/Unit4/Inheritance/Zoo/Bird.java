public class Bird extends Animal{
    public Bird(){
        super("Bird","drone");
    }
    public Bird(String name,String desc){
        super(name,desc);
    }
    @Override
    public String makeNoise(){
        return("I am a bird");
    }
}
