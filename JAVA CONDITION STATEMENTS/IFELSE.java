import java.util.*;
class IFELSE{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int a=sc.nextInt();

        if(a<18){
            System.out.println("good day");
        }else{
            System.out.println("good evening");
        }
    }
}