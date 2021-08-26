//Single line comment
/*
    This is a comment block
    JVM= Java Virtual Machine- This translates the Java code to the computer
    Java is a grandobject of C
*/

//public= any file can access this class
//class= defines that the following code is in a class
//Classname= First letter capatalized AND Same as the file name
//https://www.geeksforgeeks.org/understanding-public-static-void-mainstring-args-in-java/
public class HelloWorld {
    public static void main(String[] args)
    {
        //public means where and who can access the method
        //method= is a function that objects use. object.method notation
        //                                          noun.verb
        //static means we can run the method without creating the object
        //instantiation= creating that object
        //void means it will return nothing ie it doesn't return
        //methodName=main
        //(String[] args)= data passed into the function specifically string array
        System.out.println("Hello World");
        //; are . in computer talk - the ; is the end of the sentence

        System.out.print("Howdy");
        System.out.print("Bonejaw\n");
        System.out.print("Salut");
        System.out.print("\tsalut\n");

        System.out.println(5.1473);
        System.out.printf("%5.2f%n",5.1473);    //fancy formatting

        System.out.print("----------\n");
        System.out.print("--O----O--\n");
        System.out.print("----__----\n");
        System.out.print("-(______)-\n");
        System.out.print("----------");
    }   
}
