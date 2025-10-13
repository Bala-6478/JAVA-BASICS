class CODEPOINTBEFORE{
    public static void main(String[] args){
        StringBuffer str=new StringBuffer("geeksforgeeks");
        int unicodee=str.codePointBefore(14);
        System.out.println(str+ " at position 13 "+ unicodee);
    }
}