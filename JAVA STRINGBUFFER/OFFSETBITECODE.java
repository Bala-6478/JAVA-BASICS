class OFFSETBITECODE{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("javais good");
        System.out.println("String ="+sb.toString());
        int rev=sb.offsetByCodePoints(1,6);
        System.out.println("index ="+rev);
    }
}