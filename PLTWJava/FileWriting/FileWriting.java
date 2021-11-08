//Fuse the file output stream
import java.io.*;

public class FileWriting{
    public static void main(String[] args) throws IOException {
        //try to do this
        try(FileOutputStream output = new FileOutputStream("temp.txt");){
            //if it works do this
            for(int i=0;i<=100;i++){
                int rando=(int)(Math.random()*10);
                output.write(rando);
                byte comma = 44;
                output.write(comma);
            }
        }
        //if it fails throw the IOException


        try(FileInputStream input=new FileInputStream("temp.txt");){
            //We know that temp.txt has int and bytes

            //loop through to render the ints and bytes
            int value;
            while((value=input.read())!=-1){
                if(value!=44){
                    System.out.println(value);
                }
            }
        }
        
    }
}