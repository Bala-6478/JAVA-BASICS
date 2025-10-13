class CODEPOINTAT{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer();
        sb.append("hello java is good");
        int unicode=sb.codePointAt(10);
        System.out.println(sb+"in stringBuffer"+unicode);
    }
}