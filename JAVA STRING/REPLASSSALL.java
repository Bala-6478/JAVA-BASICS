class REPLASSSALL{
    public static void main(String[] args){
        String a="i like my cat and this is cat ";
        String regex="(?i)cat";
        System.out.println(a.replaceAll(regex,"dog"));
    }
}