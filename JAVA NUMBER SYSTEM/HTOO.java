import java.util.*;
class HTOO{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String octal=sc.nextLine();
        int decimal=Integer.parseInt(octal,8);
        String hex=Integer.toHexString(decimal).toUpperCase();

        System.out.println("hexa value"+hex);
    }
}