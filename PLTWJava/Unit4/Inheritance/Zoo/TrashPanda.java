public class TrashPanda extends Bear implements Swimming{
    public TrashPanda(){
        super("TrashPanda","Stinky...");
    }
    public TrashPanda(String name, String desc){
        super(name,desc);
    }
    public String swim(){
        return "The raccoon uses arm floatys to get the trash";
    }
}
