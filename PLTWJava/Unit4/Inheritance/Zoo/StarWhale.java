public class StarWhale extends SpaceAnimals implements Flying{
    public StarWhale(){
        super("fish","swim");
    }
    public StarWhale(String name, String desc){
        super(name,desc);
    }
    public String fly(){
        return "waaaaaaaaaaaaaaaaaaaahoooooooooooooooooh";
    }
}
