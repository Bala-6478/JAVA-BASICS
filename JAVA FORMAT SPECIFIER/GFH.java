import java.util.*;
class GFH{
    public static void main(String[] args){
        Formatter formatter=new Formatter();
        formatter.format("%x",250);
        System.out.println(formatter);

        formatter.format("%X",250);
        System.out.println(formatter);
    }
}