import java.util.*;
class HTOD{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("hexadecimal number");
        String hex=sc.nextLine();
        int decimal=Integer.parseInt(hex,16);
        System.out.println("decimal value"+decimal);
    }
}