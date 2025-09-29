class MRTURN{
    double avg(double  x,double y){
        double res=(x+y)/2.0;
        return res;
    }
    public static void main(String[] args){
        MRTURN o=new MRTURN();
        double r=o.avg(5.5,6.5);
        System.out.println(r);
        //System.out.println(new MRTURN().avg(6.0,5.5));
    }
}