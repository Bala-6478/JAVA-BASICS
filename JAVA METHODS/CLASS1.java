class CLASS1{
    static void fun(int...a){
        System.out.println("number of arguments"+a.length);
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        fun(100);
        fun(1,2,3,4,5,6);
        fun();
    }
}