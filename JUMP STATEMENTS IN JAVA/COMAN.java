class COMAN{
    public static void main(String[] args){
        System.out.println("BREAK STATEMENT");
        for(int i=0;i<=6;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("RETURN STATEMENT");
        for(int j=1;j<=4;j++){
            if(j==2){
                continue;
            }
            System.out.println(j);
        }
        System.out.println("RETURN STAREMENT");
        System.out.println("    BEFORE RETURN");
        return;
    }
}