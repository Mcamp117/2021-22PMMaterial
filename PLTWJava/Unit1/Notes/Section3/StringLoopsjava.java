import java.lang.Math;
public class StringLoopsjava {
    public static void main(String[] args) {
        removeVowels("hippopotomonstrosesquippedaliophobia");

        /*
        s.replaceAll("  "," ")
            first arg is what you are looking for
            second arg is what to replace it with
        */
    }

    private static void howMany(String s, String v){
        int output=0;
        for(int i=0;i<s.length();i++){
            if (s.substring(i,i+1).equals(v)){
                output++;
            }
        }
        System.out.println(output);
    }

    private static void spaceFinder(String s){
        int n=0;
        String output="";
        for(int i=0;i<s.length()-1;i++){
            if (s.substring(i,i+2).equals("  ")){
                n++;
                output+=" ";
                i++;
            }
            else{
                output+=s.substring(i,i+1);
            }
        }
        System.out.println(output);
        System.out.println(n);
    }

    private static void spaceFinder(String s, String f){
        while(s.indexOf(f)!= -1){ //loop while indexOf(f) finds an f
            s=s.substring(0, s.indexOf("  ")) + s.substring(s.indexOf("  ")+1);
        }
        System.out.println(s);
    }

    private static void removeVowels(String s){
        String output="";

        if (Math.random()>.5)

        for (int i=0;i<s.length();i++){
            String x= s.substring(i,i+1);
            if (!(x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u"))){
                output+=x;
            }
        }
        else{
            for (int i=0;i<s.length();i++){
                String x= s.substring(i,i+1);
                if (!(x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u")|| x.equals("y"))){
                output+=x;
                }
            }  
        }
        System.out.println(output);
    }
}
