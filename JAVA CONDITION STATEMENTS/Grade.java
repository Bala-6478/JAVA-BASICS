import java.util.*;
class Grade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grade");
        int Grade=sc.nextInt();
        if(Grade>=90){
            System.out.println("A");
        }else if(Grade>=80){
            System.out.println("B");
        }else if(Grade>=70){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
}