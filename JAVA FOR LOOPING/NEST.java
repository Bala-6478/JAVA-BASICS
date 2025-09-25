class NEST{
    public static void main(String[] args){
        for(int i=1;i<=2;i++){
            System.out.println("OUTER "+i);
            for(int j=1;j<=3;j++){
                System.out.println("INNER "+j);
            }
        }
    }
}