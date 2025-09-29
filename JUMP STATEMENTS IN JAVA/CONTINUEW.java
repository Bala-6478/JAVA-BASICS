class CONTINUEW {
    public static void main(String[] args){
        int i=0;
        while(i<=5){
            if(i==3){
                i++;
                continue;
            }
            System.out.print(i+" ");
            i++;
        }
    }
}