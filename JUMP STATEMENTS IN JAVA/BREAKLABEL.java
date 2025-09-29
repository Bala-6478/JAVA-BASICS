class BREAKLABEL{
    public static void main(String[] args){
        boolean t=true;
        first:{
            second:{
                third:{
                    System.out.println("before");
                    if(t){
                        break second;
                    }
                    System.out.println("execute");
                }
                System.out.println("java");
            }
            System.out.println("java");
        }
    }
}