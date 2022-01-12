public class SpaceAnimals extends Animal{
    public SpaceAnimals(){
        super("SpaceBoi","space");
    }
    public SpaceAnimals(String name, String desc){
        super(name,desc);
    }
    @Override
    public String makeNoise(){
        return("I am a space animal, aah");
    }
}
