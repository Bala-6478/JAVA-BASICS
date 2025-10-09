class MATCH{
    public static void main(String[] args){
        String regex="cat|dog|fish";
        System.out.println("cat".matches(regex));
        System.out.println("catfish".matches(regex));
    }
}