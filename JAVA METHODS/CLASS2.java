class CLASS2{
    static void fun2(String s,int...a){
        System.out.println("String "+s);
        System.out.println("number of arguments"+a.length);

        for(int i:a){
            System.out.print(i+" ");
        }System.out.println();
    }
    public static void main(String[] args){
        fun2("ranjith",120);
        fun2("gushan",1,23,4,4);
        fun2("gurush");
    }
}