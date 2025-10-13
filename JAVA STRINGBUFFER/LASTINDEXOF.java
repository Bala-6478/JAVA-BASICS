class LASTINDEXOF{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("java is good is java is good");
        int last=sb.lastIndexOf("good");
        System.out.println(last);
    }
}