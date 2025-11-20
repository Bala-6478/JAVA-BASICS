import java.util.*;
class OTOD{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String octal=sc.nextLine();
        int decimal=Integer.parseInt(octal,8);
        System.out.println("decimal value "+decimal);
    }
}