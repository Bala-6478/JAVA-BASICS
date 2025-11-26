class BBB{
    public static void main(String[] args){
        long date=1711638903488L;
        String result;
        result=String.format("%tl:%<tm %<tp",date);
        System.out.println(result);
        result =String.format("%B%<tc",date);
        System.out.println(result);
        result=String.format("%tc",date);
        System.out.println(result);
    }
}