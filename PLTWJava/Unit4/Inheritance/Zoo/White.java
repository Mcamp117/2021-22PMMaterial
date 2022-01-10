public class White extends Bird implements Flying,Swimming{
    public White(){
        super("White","craps an egg");
    }
    public White(String name,String desc){
        super(name,desc);
    }
    public String fly(){
        return "Craps an egg, in the air";
    }
    public String swim(){
        return "Craps an egg, in the water";
    }
}
