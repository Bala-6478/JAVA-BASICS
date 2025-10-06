public class VOTE{
    static void checkAge(int age){
        if(age>18){
            System.out.println("your eligible to vote");
        }else{
            System.out.println("Not eligable to vote");
        }
    }
    public static void main(String[] args){
        checkAge(20);
    }
}