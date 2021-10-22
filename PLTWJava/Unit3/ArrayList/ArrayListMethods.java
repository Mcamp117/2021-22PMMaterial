import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int[] ia ={1,2,0,3,2,4,2,1,0,2,0,1,3,2};
        arrList=createArrayList(ia);
        System.out.println(minIntAl(arrList));
    }

    public static ArrayList <Integer> createArrayList(int[] iarr){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i=0;i<iarr.length;i++){
            temp.add(iarr[i]);
        }
        return temp;
    }
    public static int minIntAl(ArrayList<Integer> temp){
        int min=Integer.MAX_VALUE;
        for (int i=0;i<temp.size();i++){
            if(temp.get(i)<min){
                min=temp.get(i);
            }
        }
        return min;
    }
}
