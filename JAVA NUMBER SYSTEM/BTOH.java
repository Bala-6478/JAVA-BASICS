import java.util.*;
class BTOH{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String binary=sc.nextLine();
        int decimal=Integer.parseInt(binary,2);
        String hex=Integer.toHexString(decimal).toUpperCase();
        System.out.println("hexadecimal value"+hex);
    }
}