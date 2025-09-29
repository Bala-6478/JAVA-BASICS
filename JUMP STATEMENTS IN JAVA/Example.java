public class Example{
    public static int add(int a,int b){
        return a+b;
    }
    public static void printMessage(String message){
        System.out.println(message);
        return;
    }
    public static void main(String[] args){
        int sum=add(5,3);
        System.out.println(sum);
        printMessage("hello world");
    }
}