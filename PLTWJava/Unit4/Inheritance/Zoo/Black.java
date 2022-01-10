public class Black extends Bird implements Flying, Swimming{
    public Black(){
        super("Black","explodes");
    }
    public Black(String name,String desc){
        super(name,desc);
    }
    public String fly(){
        return "'plodes on impact";
    }
    public String swim(){
        return "Just floats";
    }
}
