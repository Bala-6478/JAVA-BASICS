import java.util.*;
class BTOO{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String binary=sc.nextLine();
        int decimal=Integer.parseInt(binary,2);
        String octal=Integer.toOctalString(decimal);
        System.out.println("octal value "+octal);
    }
}