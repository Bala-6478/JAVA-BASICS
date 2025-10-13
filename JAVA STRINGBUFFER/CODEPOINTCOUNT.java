class CODEPOINTCOUNT{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("java is good");
        int code=sb.codePointCount(4,8);
        System.out.println(sb + "count position is "+code);
    }
}