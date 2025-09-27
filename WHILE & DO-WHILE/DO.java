import java.util.*;
class DO{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        do{
            System.out.println("enter the number >10");
            count=sc.nextInt();
        }while(count<10);
    }
}