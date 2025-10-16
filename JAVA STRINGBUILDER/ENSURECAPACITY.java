class ENSURECAPACITY{
    public static void main(String[] args){
        StringBuilder sv=new StringBuilder("java");
        System.out.println("old capcity ="+sv.capacity());
        sv.ensureCapacity(44);
        System.out.println(sv.capacity());
    }
}