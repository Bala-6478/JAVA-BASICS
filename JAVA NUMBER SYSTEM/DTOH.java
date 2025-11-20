import java.util.*;
class DTOH{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        String hex=Integer.toHexString(decimal).toUpperCase();
        System.out.println("hexadecimal value "+hex);
    }
}