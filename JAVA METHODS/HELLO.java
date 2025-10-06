class HELLO{
    public static void main(String[] args){
        if(args.length>0){
            System.out.println("in command line argument");
            for(String var:args)
            System.out.println(var);
        }else{
            System.out.println("no argument");
        }
    }
}