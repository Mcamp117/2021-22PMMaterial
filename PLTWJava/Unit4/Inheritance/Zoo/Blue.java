public class Blue extends Bird implements Flying,Swimming{
    public Blue(){
        super("Blue","split");
    }
    public Blue(String name,String desc){
        super(name,desc);
    }
    public String fly(){
        return "Flies in formation";
    }
    public String swim(){
        return "Just floats";
    }
}
