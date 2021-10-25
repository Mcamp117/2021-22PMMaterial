import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int[] ia ={1,2,0,3,2,4,2,1,0,2,0,1,3,2};
        arrList=createArrayList(ia);
        System.out.println(mode(arrList));
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
    public static int maxIntAl(ArrayList<Integer> temp){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<temp.size();i++){
            if(temp.get(i)>max){
                max=temp.get(i);
            }
        }
        return max;
    }
    public static int aveIntAl(ArrayList<Integer> temp){
        int total=0;
        for (int i=0;i<temp.size();i++){
            total+=temp.get(i);
        }
        return total/temp.size();
    }
    public static int count(ArrayList<Integer> temp, int valueToCheck){
        int count = 0;
        //for each loop
        for(int dog: temp){
            //if only a 1 line then, curly braces are optional
            if (dog==valueToCheck)
                count++;
        }
        if (count>0){
           return count; 
        }
        else{
            return -1;
        }
        
    }
    /*public static int mode(ArrayList<Integer> temp){
        int mode=0;
        int modeValue=0;
        ArrayList<Integer> modeCount = new ArrayList<Integer>();
        for (int n: temp){
            modeCount.add(0);
        }
        for (int n: temp){
            modeCount.set(n,(modeCount.get(n)+1));
            if(modeCount.get(n)>modeValue){
                modeValue=modeCount.get(n);
                mode=n;
            }
        }
        return mode;
    }*/
    public static int mode(ArrayList<Integer> temp){
        int mode=0;
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();
        uniqueList=removeDuplicates(temp);
        ArrayList<Integer> countList = new ArrayList<Integer>();
        for (int n:uniqueList){
            countList.add(0);
        }
        for (int n:uniqueList){
            int c = count(temp,n);
            countList.set(countList.get(n)+1,c);
        }
        int modeValue=maxIntAl(countList);
        mode=uniqueList.get(countList.get(modeValue));
        return mode;
    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> temp){
        ArrayList<Integer> out = new ArrayList<Integer>();
        for (int n: temp){
            if(!out.contains(n)){
                out.add(n);
            }
        }
        return out;
    }

}
