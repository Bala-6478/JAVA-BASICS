class TRIM{
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer(50);
        s.append("hello");
        System.out.println("before trim");
        System.out.println(s.length());
        System.out.println(s.capacity());

        s.trimToSize();
        System.out.println(s.capacity());
    }
}