class BREAKLABLE{
    public static void main(String[] args){
        for(int i=0;i<=3;i++){
            one :{
                two: {
                    three: {
                        System.out.println("i="+i);
                        if(i==0)
                        break one;
                        if(i==1)
                        break two;
                        if(i==2)
                        break three;
                    }
                    System.out.println("after three ");
                }
                System.out.println("after two");
            }
            System.out.println("after one");
        }
    }
}