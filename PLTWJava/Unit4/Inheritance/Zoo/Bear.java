public abstract class Bear extends Animal{
    public Bear(){
        super("Teddy","bear");
    }
    public Bear(String name, String desc){
        super(name,desc);
    }
    @Override
    public String makeNoise(){
        return("I am a bear");
    }
    public String walk(){
        return "roaming free";
    }
}
