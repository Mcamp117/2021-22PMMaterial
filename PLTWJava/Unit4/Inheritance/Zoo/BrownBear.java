public class BrownBear extends Bear implements Swimming{
    public BrownBear(){
        super("BrownBare","brown");
    }
    public BrownBear(String name, String desc){
        super(name,desc);
    }
    public String swim(){
        return "Get da fish";
    }
    @Override
    public String walk(){
        return("Going to hunt a girl who ate his poridge");
    }
}
