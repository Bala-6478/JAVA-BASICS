class RET{
    void cal(int a,int b){
        int res=(a+b)/10;
        System.out.println(res);
    }
    public static void main(String[] args){
        new RET().cal(5,5);
        System.out.println("no return values,sucessfully !");
    }
}