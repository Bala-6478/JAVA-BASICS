public class EXA{
    public static void D(){
        float d=40.8f;
        System.out.println("in methode D");
    }
    public static void C(){
        double c=30.5;
        System.out.println("in methode C");
    }
    public static void B(){
        int b=20;
        C();
        System.out.println("in methode B");
    }
    public static void A(){
        int a=10;
        B();
        System.out.println("in methode A");
    }
    public static void main(String[] args){
        A();
        D();
    }
}