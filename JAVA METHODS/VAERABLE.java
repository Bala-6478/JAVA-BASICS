import java.util.*;
class VAERABLE{
    public static void Names(String...n){
        for(String i:n){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Names("geeks","geeks");
        Names("geeks","geeks","geeks");
    }
}