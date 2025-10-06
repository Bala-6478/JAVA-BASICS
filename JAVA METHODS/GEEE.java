import java.util.*;
public class GEEE{
    static int a=40;
    int b=50;
    void simpledisplay(){
        System.out.println(a);
        System.out.println(b);
    }
    static void staicdisplay(){
        System.out.println(a);
    }
    public static void main(String[] args){
        GEEE obj=new GEEE();
        obj.simpledisplay();
        staicdisplay();
    }
}