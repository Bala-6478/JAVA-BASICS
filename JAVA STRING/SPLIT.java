class SPLIT{
    public static void main(String[] args){
        String s="split a string by spaces , and  also punctuations";
        String regex="[,\\/\\s]";
        String[] myarray=s.split(regex);
        for(String a:myarray){
            System.out.println(a);
        }
    }
}