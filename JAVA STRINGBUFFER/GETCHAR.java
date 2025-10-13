import java.util.*;
class GETCHAR{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Geeks for Geeks");
        System.out.println(sb.toString());
        char[] array=new char[15];
        Arrays.fill(array,'.');
        sb.getChars(0,9,array,1);
        System.out.println("char array =");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}