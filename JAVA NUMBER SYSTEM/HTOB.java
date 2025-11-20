import java.util.*;
class HTOB{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String hex=sc.nextLine();
        int decimal=Integer.parseInt(hex,16);
        String binary=Integer.toBinaryString(decimal);
        System.out.println("binary value "+binary);
    }
}