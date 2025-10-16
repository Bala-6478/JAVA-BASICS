class CAPCATITY{
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("java");
        int a=sb.capacity();
        System.out.println(a);
        StringBuilder sv=new StringBuilder();
        System.out.println(sv.capacity());
    }
}