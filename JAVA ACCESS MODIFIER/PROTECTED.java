class VEHICLE{
    protected int speed;
}
class BIKE extends VEHICLE{
    void setSpeed(int s){
        speed =s;
    }
    int getSpeed()
    {
        return speed;
    }
}
public class PROTECTED{
    public static void main(String[] args){
        BIKE b=new BIKE();
        b.setSpeed(100);
        System.out.println("Access via subclass method:"+b.getSpeed());
        VEHICLE v=new VEHICLE();
        System.out.println(v.speed);
    }
}