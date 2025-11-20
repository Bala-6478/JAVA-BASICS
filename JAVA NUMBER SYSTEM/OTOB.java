import java.util.*;
class OTOB{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String octal=sc.nextLine();
        int decimal=Integer.parseInt(octal,8);
        String binary=Integer.toBinaryString(decimal);
        System.out.println("binary value "+binary);
    }
}