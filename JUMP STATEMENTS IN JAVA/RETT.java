class RETT{
    void check(double i){
        if(i<9){
            return;
        }
        i++;
    }
    public static void main(String[] args){
        RETT o=new RETT();
        o.check(5.5);
        System.out.println("program executed");
    }
}