class CONDIINSDERET{
    void demo(double v){
        if(v<0){
            System.err.println(v);
            return;
        }else{
            ++v;
        }
    }
    public static void main(String[] args){
        new CONDIINSDERET().demo(-1);
        System.out.println("program executed !!!");
    }
}