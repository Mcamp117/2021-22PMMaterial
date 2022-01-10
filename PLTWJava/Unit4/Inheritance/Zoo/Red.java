public class Red extends Bird implements Flying,Swimming{
    public Red(){
        super("Red","red bird");
    }
    public Red(String name,String desc){
        super(name,desc);
    }
    public String fly(){
        return "Just flying";
    }
    public String swim(){
        return "Just floats";
    }
}
