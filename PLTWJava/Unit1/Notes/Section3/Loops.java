import java.util.Scanner;
public class Loops{
    public static void main(String[] args) {
        // while(true){
        //     System.out.println("Hi");
        // }
        // int i=1;
        // while(i<11){
        //     System.out.print(i+", ");
        //         i++;
        // }
        //for i in range (10)
            //print(i+1)
        // System.out.println();

        // for(int j=1;j<11;j++){
        //     System.out.print(j+", ");
        // }
        // System.out.println();

        // for(int k=10;k>0;k--){
        //     System.out.print(k+", ");
        // }

        // System.out.println();
        
        //for(iterator number; loops until; step count)
        // for(int j=1;j<11;j++){
        //     if(j<10){
        //         System.out.print(j+", ");
        //     }
        //     else{
        //         System.out.print(j);
        //     }
        // }

        // int j=1;
        // while(j<11){
        //     if(j<10){
        //         System.out.print(j+", ");
        //     }
        //     else{
        //         System.out.print(j);
        //     }
        //     j++;
        // }
        basicStats();
    }  

    // private static void minMaxChecker() {
    //     Scanner ui = new Scanner(System.in);
    //     System.out.println("What is your number? ");
    //     int numba=ui.nextInt(); 
    //     int min=Integer.MAX_VALUE;
    //     int max=Integer.MIN_VALUE;
    //     while(numba!=-1){
    //         if(numba>max){
    //             max=numba;
    //         }
    //         else if(numba<min){
    //             min=numba;
    //         }
    //         System.out.println("What is your number? ");
    //         numba=ui.nextInt();
    //     }
    //     System.out.println("min: "+min);
    //     System.out.println("max: "+max);

    // }

    private static void basicStats(){
        Scanner ui = new Scanner(System.in);
        System.out.println("What is your number? ");
        String numba=ui.nextLine(); 
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int total=0;
        int numberofNumbers=0;
        while(!numba.equals("q")){
            total+=Integer.valueOf(numba);
            numberofNumbers++;
            if(Integer.valueOf(numba)>max){
                max=Integer.valueOf(numba);
            }
            else if(Integer.valueOf(numba)<min){
                min=Integer.valueOf(numba);
            }
            System.out.println("What is your number? ");
            numba=ui.nextLine();
        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);
        System.out.println("sum: "+total);
        System.out.println("total: "+total/numberofNumbers);
        ui.close();
    }
    
}
