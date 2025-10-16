class INDEXOF{
    public static void main(String[] args) {
    String sv=new String("java is good");
    String s1=new String("good");
    System.out.println("find the o position ");
    System.out.println(sv.indexOf('o'));

    System.out.println(sv.indexOf('a', 12));
    System.out.println(sv.indexOf(s1));
    }
}