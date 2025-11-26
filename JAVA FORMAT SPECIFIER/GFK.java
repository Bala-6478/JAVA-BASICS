import java.util.*;
class GFK{
    public static void main(String[] args){
        Formatter formatter=new Formatter();
        formatter.format("%d",111);
        System.out.println(formatter);
        //Formatter formatter=new Formatter();
        formatter.format("%d",-111);
        System.out.println(formatter);
        //Formatter formatter=new Formatter();
        formatter.format("%d",222);
        System.out.println(formatter);
        //Formatter formatter=new Formatter();
        formatter.format("%d",-222);
        System.out.println(formatter);
    }    
}