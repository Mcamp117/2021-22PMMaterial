public class MichaelPhelps extends SpaceAnimals implements Swimming{
    public MichaelPhelps(){
        super("fish","swim");
    }
    public MichaelPhelps(String name, String desc){
        super(name,desc);
    }
    public String swim(){
        return "blub blub";
    }
}
