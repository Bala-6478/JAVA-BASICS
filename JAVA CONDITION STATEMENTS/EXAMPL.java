import java.util.*;
class EXAMPL{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("no a even number");
        }
    }
}