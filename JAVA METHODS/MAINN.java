public class MAINN{
    public int max(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args){
        MAINN ob=new MAINN();
        int result=ob.max(8, 3);
        System.out.println(result);
        //System.out.println(new MAINN().max(3,7));
    }
}