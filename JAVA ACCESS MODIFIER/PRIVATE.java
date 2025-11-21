class PRIVATE{
    private String name;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args){
        PRIVATE p=new PRIVATE();
        p.setName("alice");

        System.out.println(p.getName());
    }
}