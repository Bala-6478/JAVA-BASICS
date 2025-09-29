class Sq{
    public int square(int n){
        return n*n;
    }
    public static void main(String[] args){
        Sq o=new Sq();
        int r=o.square(5);
        System.out.println(r);
    }
}