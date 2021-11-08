import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferWriter {
    //global variables 
    private static final String DATA_FILE="mymedia.txt";
    private static Scanner in;
    private static BufferedWriter out;

    
    //writeString
    public static void writeString(String s){
        //check to see if out is created
        if (out==null){
            try{
                out = new BufferedWriter(new FileWriter(DATA_FILE));
            }
            catch(Exception e){
                System.err.println("Cannot open file for output!");
                e.printStackTrace();
            }
        }
        try{
            out.write(s);
            out.newLine();
        }
        catch(Exception e){
            System.err.println("Cannot write file");
            e.printStackTrace();
        }
    }
    
    //saveAndClose
    public static void saveAndClose(){
        if(in!=null){
            try {
                in.close();
                in=null;
            }
            catch (Exception e) {
                System.err.println("Cannot close input file!");
                e.printStackTrace();
            }
        }
        if (out!=null){
            try{
                out.close();
                out=null;
            }
            catch(Exception e){
                System.err.println("Cannot close output file!");
                e.printStackTrace();
            }
        }
    }
    //readString
    public static String readString(){
        //check to see if you are already reading
        if (in==null){
            try{
                in=new Scanner(new File(DATA_FILE));
            }
            catch(Exception e){
                System.err.println("Cannot open file for input");
                e.printStackTrace();
            }
        }
        //read in the values
        try{
            //check to see if in hasNext line
            if(in.hasNext()){
                String s = in.nextLine();
                return s;
            }
            else{
                return null;
            }
        }
        catch(Exception e){
            System.err.println("Cannot read the file");
            e.printStackTrace();
        }
        return null;
    }
}
