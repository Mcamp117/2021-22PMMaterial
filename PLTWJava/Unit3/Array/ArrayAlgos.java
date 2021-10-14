public class ArrayAlgos {
    public static void main(String[] args) {
        // double[] test ={12,7,13,8,4.0,3,72};
        // sum(test);
        // average(test);
        // min(test);
        // max(test);
        Player[] players = {new Player("Alex", 12,"Harrison"), new Player("Aiden", 13,"Castle"),
                    new Player("Chris", 15,"Reitz"), new Player("Charlie", 15, "Reitz"), new Player("Jimbob",3, "Fairlawn") };
        boolean hasValue=false;
        String[] school= new String[5];
        int i=0;
        // while (!hasValue && i<(players.length-1)){
        //     if(players[i].getAge()>=18){
        //         hasValue=true;
        //         System.out.println(players[i].getName());
        //     }
        //     i++;
        // }
        while (!hasValue && i<(players.length-1)){
            if(players[i].getSchool()=="Reitz"){
                hasValue=true;
                school[i]=players[i].getName();
                System.out.println(players[i].getName());
            }
            i++;
        }
    }
    private static void sum(double[] listy){
        double sum=0.0;
        for (int i=0;i<listy.length;i++){
            sum+=listy[i];
        }
        System.out.printf("\n%f",(sum));
    }
    private static void average(double[] listy){
        double sum=0.0;
        for (int i=0;i<listy.length;i++){
            sum+=listy[i];
        }
        System.out.printf("\n%f",(sum/listy.length));
    }
    private static void min(double[] listy){
        double min = Double.MAX_VALUE;
        for (int i=0;i<listy.length;i++){
            if(listy[i]<min){
                min=listy[i];
            }
        }
        System.out.printf("\n%f",(min));
    }
    private static void max(double[] listy){
        double max = Double.MIN_VALUE;
        for (int i=0;i<listy.length;i++){
            if(listy[i]>max){
                max=listy[i];
            }
        }
        System.out.printf("\n%f",(max));
    }
}
