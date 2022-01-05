public class HorseBuggy extends Automobile{
    String material, steering, doors, color, fuel, speed;
    public HorseBuggy (String material,String color,String fuel,String speed){
        super(material, color, fuel, speed);
    }
    public void poop(){
        System.out.println("well crap");
    }
}