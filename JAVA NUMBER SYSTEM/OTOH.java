import java.util.*;
class OTOH{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String hex=sc.nextLine();
        int decimal=Integer.parseInt(hex,16);
        String octal=Integer.toOctalString(decimal);
        System.out.println("octal value "+octal);
    }
}