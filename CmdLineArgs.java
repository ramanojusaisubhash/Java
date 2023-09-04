import java.io.*;
import java.lang.*;
import java.util.*;
public class CmdLineArgs extends Object{
//Object is the super class of all class in java
public static void main(String args[]){
   if(args.length!=2){
       System.out.println("enter only two integers");
   }
   else{
   int x = Integer.parseInt(args[0]);
   int y = Integer.parseInt(args[1]);
   int z = x + y;
   System.out.println("Sum of "+x+" and "+y+" is "+z);
   }
}
}